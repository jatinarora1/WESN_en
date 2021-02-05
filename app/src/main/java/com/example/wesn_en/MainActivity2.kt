package com.example.wesn_en

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
var dataPoints: Array<DataPoint> = Array(15,init = { DataPoint(0.0,0.0) })
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent: Intent = getIntent()

        val MAC: TextView = findViewById(R.id.MAC)
        val RSSI: TextView = findViewById(R.id.Rssi)
        val Device: TextView = findViewById(R.id.Device)

        MAC.text = intent.getStringExtra("MAC")
        RSSI.text = intent.getStringExtra("RSSI")
        Device.text = intent.getStringExtra("Device")

        val graph: GraphView = findViewById(R.id.graph)
        val data = Data.genData(15)
        for(i in 0..14)
        {
            val d:DataPoint = DataPoint(data[i].Device,data[i].Time)
            dataPoints[i] = d
        }

        val series: LineGraphSeries<DataPoint> = LineGraphSeries<DataPoint>(dataPoints)
        series.isDrawDataPoints = true
        graph.addSeries(series)
        graph.viewport.setMinX(0.0);
        graph.viewport.setMaxX(20.0);
        graph.viewport.setMinY(0.0);
        graph.viewport.setMaxY(15.0);
        graph.viewport.isYAxisBoundsManual = true;
        graph.viewport.isXAxisBoundsManual = true;
        graph.gridLabelRenderer.setHumanRounding(false)
    }
}