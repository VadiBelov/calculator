package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.E

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_number_0:Button=findViewById(R.id.button_number_0)
        val btn_number_1:Button=findViewById(R.id.button_number_1)
        val btn_number_2:Button=findViewById(R.id.button_number_2)
        val btn_number_3:Button=findViewById(R.id.button_number_3)
        val btn_number_4:Button=findViewById(R.id.button_number_4)
        val btn_number_5:Button=findViewById(R.id.button_number_5)
        val btn_number_6:Button=findViewById(R.id.button_number_6)
        val btn_number_7:Button=findViewById(R.id.button_number_7)
        val btn_number_8:Button=findViewById(R.id.button_number_8)
        val btn_number_9:Button=findViewById(R.id.button_number_9)

        val btn_ravno:Button=findViewById(R.id.button_ravno)
        val btn_plus:Button=findViewById(R.id.button_plus)
        val btn_minus:Button=findViewById(R.id.button_minus)
        val btn_del:Button=findViewById(R.id.button_delenie)
        val btn_umn:Button=findViewById(R.id.button_umnozh)
        val btn_point:Button=findViewById(R.id.button_point)

        val tv_input: EditText=findViewById(R.id.editTextNumberDecimal_input)
        val tv_operator: TextView=findViewById(R.id.textView_Operator)
        val tv_result: TextView=findViewById(R.id.textView_result)

        var result:Float=0.0f


        btn_number_0.setOnClickListener{
            tv_input.setText(tv_input.text.toString()+btn_number_0.text)
        }
        btn_number_1.setOnClickListener{
            tv_input.setText(tv_input.text.toString()+btn_number_1.text)
        }
        btn_number_2.setOnClickListener{
            tv_input.setText(tv_input.text.toString()+btn_number_2.text)
        }
        btn_number_3.setOnClickListener{
            tv_input.setText(tv_input.text.toString()+btn_number_3.text)
        }
        btn_number_4.setOnClickListener{
            tv_input.setText(tv_input.text.toString()+btn_number_4.text)
        }
        btn_number_5.setOnClickListener{
            tv_input.setText(tv_input.text.toString()+btn_number_5.text)
        }
        btn_number_6.setOnClickListener{
            tv_input.setText(tv_input.text.toString()+btn_number_6.text)
        }
        btn_number_7.setOnClickListener{
            tv_input.setText(tv_input.text.toString()+btn_number_7.text)
        }
        btn_number_8.setOnClickListener{
            tv_input.setText(tv_input.text.toString()+btn_number_8.text)
        }
        btn_number_9.setOnClickListener{
            tv_input.setText(tv_input.text.toString()+btn_number_9.text)
        }

        btn_point.setOnClickListener{
            if (tv_input.text.toString() == "") {
                val str = "0."
                tv_input.setText(str)
            } else if (tv_input.text.toString().indexOf('.') == -1) {
                val str = "${tv_input.text}."
                tv_input.setText(str)
            }
        }

        btn_ravno.setOnClickListener{
            if (tv_input.text.toString() != "") {
                if(tv_result.text.toString()==""){
                    tv_operator.text = getText(R.string.ravno)
                    tv_result.text = ""
                }
                if(tv_operator.text.toString()=="*") {
                    result = tv_input.text.toString().toFloat() * tv_result.text.toString().toFloat()
                    tv_operator.text = getText(R.string.ravno)
                    tv_result.text = ""
                    tv_input.setText("$result")
                }
                if(tv_operator.text.toString()=="/") {
                    result = tv_result.text.toString().toFloat() / tv_input.text.toString().toFloat()
                    tv_operator.text = getText(R.string.ravno)
                    tv_result.text = ""
                    tv_input.setText("$result")
                }
                if(tv_operator.text.toString()=="+") {
                    result = tv_input.text.toString().toFloat() + tv_result.text.toString().toFloat()
                    tv_operator.text = getText(R.string.ravno)
                    tv_result.text = ""
                    tv_input.setText("$result")
                }
                if(tv_operator.text.toString()=="-") {
                    result =  tv_result.text.toString().toFloat()-tv_input.text.toString().toFloat()
                    tv_operator.text = getText(R.string.ravno)
                    tv_result.text = ""
                    tv_input.setText("$result")
                }
            }
            if ((tv_input.text.toString() == "")and(tv_result.text.toString()!="")){
                result=tv_result.text.toString().toFloat()
                tv_input.setText("$result")
                tv_result.text = ""
                tv_operator.text=getText(R.string.ravno)
                }
        }


        btn_plus.setOnClickListener{
            if (tv_input.text.toString() != "") {
                if(tv_operator.text.toString()!="+"){
                    if(tv_operator.text.toString()=="-"){
                        tv_operator.text=getText(R.string.plus)
                        result=tv_result.text.toString().toFloat()-tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text="$result"
                    }
                    if(tv_operator.text.toString()=="*"){
                        tv_operator.text=getText(R.string.plus)
                        result=tv_result.text.toString().toFloat()*tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text="$result"
                    }
                    if(tv_operator.text.toString()=="/"){
                        tv_operator.text=getText(R.string.plus)
                        result=tv_result.text.toString().toFloat()/tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text="$result"
                    }
                    if((tv_operator.text.toString()=="=")or(tv_operator.text.toString()=="Operator")){
                        tv_operator.text=getText(R.string.plus)
                        tv_result.text = tv_input.text.toString()
                        tv_input.setText("")
                    }
                }
                else {
                    if (tv_result.text.toString() != "") {
                        result =
                            tv_input.text.toString().toFloat() + tv_result.text.toString().toFloat()
                        tv_operator.text = getText(R.string.plus)
                        tv_input.setText("")
                        tv_result.text = "$result"
                    }
                }
            }
            if (tv_operator.text.toString()!="+"){
                tv_operator.text=getText(R.string.plus)
            }
        }

        btn_minus.setOnClickListener{
            if (tv_input.text.toString() != "") {
                if(tv_operator.text.toString()!="-"){
                    if(tv_operator.text.toString()=="+"){
                        tv_operator.text=getText(R.string.minus)
                        result=tv_result.text.toString().toFloat()+tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text="$result"
                    }
                    if(tv_operator.text.toString()=="*"){
                        tv_operator.text=getText(R.string.minus)
                        result=tv_result.text.toString().toFloat()*tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text="$result"
                    }
                    if(tv_operator.text.toString()=="/"){
                        tv_operator.text=getText(R.string.minus)
                        result=tv_result.text.toString().toFloat()/tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text="$result"
                    }
                    if((tv_operator.text.toString()=="=")or(tv_operator.text.toString()=="Operator")){
                        tv_operator.text=getText(R.string.minus)
                        tv_result.text = tv_input.text.toString()
                        tv_input.setText("")
                    }
                }
                else {
                    if (tv_result.text.toString() != "") {
                        result =
                            tv_result.text.toString().toFloat() - tv_input.text.toString().toFloat()
                        tv_operator.text = getText(R.string.minus)
                        tv_input.setText("")
                        tv_result.text = "$result"
                    }
                }
            }
            if (tv_operator.text.toString()!="-"){
                tv_operator.text=getText(R.string.minus)
            }
        }

        btn_del.setOnClickListener {
            if (tv_input.text.toString() != "") {
                if (tv_operator.text.toString() != "/") {
                    if (tv_operator.text.toString() == "-") {
                        tv_operator.text = getText(R.string.delenie)
                        result =
                            tv_result.text.toString().toFloat() - tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text = "$result"
                    }
                    if (tv_operator.text.toString() == "*") {
                        tv_operator.text = getText(R.string.delenie)
                        result =
                            tv_result.text.toString().toFloat() * tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text = "$result"
                    }
                    if (tv_operator.text.toString() == "+") {
                        tv_operator.text = getText(R.string.delenie)
                        result =
                            tv_result.text.toString().toFloat() + tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text = "$result"
                    }
                    if((tv_operator.text.toString()=="=")or(tv_operator.text.toString()=="Operator")){
                        tv_operator.text=getText(R.string.delenie)
                        tv_result.text = tv_input.text.toString()
                        tv_input.setText("")
                    }
                } else {
                    if (tv_result.text.toString() != "") {
                        result =
                            tv_result.text.toString().toFloat() / tv_input.text.toString().toFloat()
                        tv_operator.text = getText(R.string.delenie)
                        tv_input.setText("")
                        tv_result.text = "$result"
                    }
                }
            }
            if (tv_operator.text.toString() != "/") {
                tv_operator.text = getText(R.string.delenie)
            }
        }

        btn_umn.setOnClickListener{
            if (tv_input.text.toString() != "") {
                if(tv_operator.text.toString()!="*"){
                    if(tv_operator.text.toString()=="-"){
                        tv_operator.text=getText(R.string.umnozh)
                        result=tv_result.text.toString().toFloat()-tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text="$result"
                    }
                    if(tv_operator.text.toString()=="/"){
                        tv_operator.text=getText(R.string.umnozh)
                        result=tv_result.text.toString().toFloat()/tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text="$result"
                    }
                    if(tv_operator.text.toString()=="+"){
                        tv_operator.text=getText(R.string.umnozh)
                        result=tv_result.text.toString().toFloat()+tv_input.text.toString().toFloat()
                        tv_input.setText("")
                        tv_result.text="$result"
                    }
                    if((tv_operator.text.toString()=="=")or(tv_operator.text.toString()=="Operator")){
                        tv_operator.text=getText(R.string.umnozh)
                        tv_result.text = tv_input.text.toString()
                        tv_input.setText("")
                    }
                }
                else {
                    if (tv_result.text.toString() != "") {
                        result =
                            tv_result.text.toString().toFloat() * tv_input.text.toString().toFloat()
                        tv_operator.text = getText(R.string.umnozh)
                        tv_input.setText("")
                        tv_result.text = "$result"
                    }
                }
            }
            if (tv_operator.text.toString()!="*"){
                tv_operator.text=getText(R.string.umnozh)
            }
        }
    }
}