package com.n_droidev.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.n_droidev.ui.databinding.FragmentCodeExamplesBinding
import net.cryptobrewery.syntaxview.SyntaxView

class SyntaxViewFragment : Fragment() {

    private var _binding: FragmentCodeExamplesBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentCodeExamplesBinding.inflate(inflater, container, false)
        val codeView: SyntaxView = binding.codeView

        codeView.code.setText( arguments?.getString(ARG_CODE) ?: "Null example")
        codeView.code.isEnabled=false

        return binding.root
    }

    companion object {
        private const val ARG_CODE = "code_view_example"

        @JvmStatic
        fun newInstance(codeExample: String): SyntaxViewFragment {
            return SyntaxViewFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_CODE, codeExample)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}