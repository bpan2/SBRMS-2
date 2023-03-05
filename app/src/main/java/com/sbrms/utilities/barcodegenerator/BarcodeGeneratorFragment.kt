package com.sbrms.utilities.barcodegenerator

import android.graphics.Bitmap
import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.sbrms.databinding.FragmentBarcodeGeneratorBinding

class BarcodeGeneratorFragment : Fragment() {
    private var _binding: FragmentBarcodeGeneratorBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var mViewModel: BarcodGeneratorViewModel? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val multiFormatWriter = MultiFormatWriter()
        _binding = FragmentBarcodeGeneratorBinding.inflate(inflater, container, false)

        binding.generateButton.setOnClickListener{
            try {
                val bitMatrix: BitMatrix = multiFormatWriter.encode(
                    binding.barcodeGeneratorTextField.text.toString(),
                    BarcodeFormat.UPC_A,
                    binding.imageBarcode.width,
                    binding.imageBarcode.height,
                )
                val bitmap = Bitmap.createBitmap(
                    binding.imageBarcode.width,
                    binding.imageBarcode.height,
                    Bitmap.Config.RGB_565
                )
                for (i in 0 until binding.imageBarcode.width) {
                    for (j in 0 until binding.imageBarcode.height) {
                        bitmap.setPixel(i, j, if (bitMatrix[i, j]) Color.BLACK else Color.WHITE)
                    }
                }
                binding.imageBarcode.setImageBitmap(bitmap)
            } catch (e: WriterException) {
                e.printStackTrace()
            }

        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProvider(this).get(
            BarcodGeneratorViewModel::class.java
        )
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance(): BarcodeGeneratorFragment {
            return BarcodeGeneratorFragment()
        }
    }

}