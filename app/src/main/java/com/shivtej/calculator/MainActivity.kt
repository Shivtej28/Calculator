package com.shivtej.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.shivtej.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private  var process : String = ""
    private var checkBracket : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.darkMode.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        binding.lightMode.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

        binding.mcAllClear.setOnClickListener {
            binding.tvInput.text = ""
            binding.tvOutput.text = ""
            process = ""
        }

        binding.btn0.setOnClickListener {
            process += binding.tv0.text.toString()
            binding.tvInput.text = process
        }

        binding.btn1.setOnClickListener {
            process += binding.tv1.text.toString()
            binding.tvInput.text = process
        }

        binding.btn2.setOnClickListener {
            process += binding.tv2.text.toString()
            binding.tvInput.text = process
        }

        binding.btn3.setOnClickListener {
            process += binding.tv3.text.toString()
            binding.tvInput.text = process
        }

        binding.btn4.setOnClickListener {
            process += binding.tv4.text.toString()
            binding.tvInput.text = process
        }

        binding.btn5.setOnClickListener {
            process += binding.tv5.text.toString()
            binding.tvInput.text = process
        }
        binding.btn6.setOnClickListener {
            process += binding.tv6.text.toString()
            binding.tvInput.text = process
        }

        binding.btn7.setOnClickListener {
            process += binding.tv7.text.toString()
            binding.tvInput.text = process
        }

        binding.btn8.setOnClickListener {
            process += binding.tv8.text.toString()
            binding.tvInput.text = process
        }

        binding.btn9.setOnClickListener {
            process += binding.tv9.text.toString()
            binding.tvInput.text = process
        }

        binding.btnAdd.setOnClickListener {
            process += binding.tvAdd.text.toString()
            binding.tvInput.text = process
        }

        binding.btnSubtract.setOnClickListener {
            process += binding.tvSubtract.text.toString()
            binding.tvInput.text = process
        }

        binding.btnDiv.setOnClickListener {
            process += binding.tvDiv.text.toString()
            binding.tvInput.text = process
        }

        binding.btnMultiply.setOnClickListener {
            process += binding.tvMultiply.text.toString()
            binding.tvInput.text = process
        }

        binding.btnDot.setOnClickListener {
            process += binding.tvDot.text.toString()
            binding.tvInput.text = process
        }

        binding.btnPercent.setOnClickListener {
            process += binding.tvPercent.text.toString()
            binding.tvInput.text = process
        }

        binding.btnBracket.setOnClickListener {
            if(checkBracket){
                process += ")"
                binding.tvInput.text = process
                checkBracket = false
            }else{
                process += "("
                binding.tvInput.text = process
                checkBracket = true
            }
        }

        binding.btnEqual.setOnClickListener {
            val expression = ExpressionBuilder(process).build()
            val result = expression.evaluate()
            val longResult = result.toLong()
            if(result == longResult.toDouble()){
                binding.tvOutput.text = longResult.toString()
            }else{
                binding.tvOutput.text = result.toString()
            }
            process = ""
        }





    }


}