package com.example.wesn_en

data class Data(
    val MAC: String,
    val RSSI: String,
    val Device: Double,
    val Time: Double
) {
    companion object {
         private val mac = arrayOf(
             "1C-74-D6-9F-B3-02",
             "1C-74-D6-9F-B3-03",
             "1C-74-D6-9F-B3-04",
             "1C-74-D6-9F-B3-05",
             "1C-74-D6-9F-B3-06",
             "1C-74-D6-9F-B3-07",
             "1C-74-D6-9F-B3-07",
             "1C-74-D6-9F-B3-07",
             "1C-74-D6-9F-B3-07",
             "1C-74-D6-9F-B3-07",
             "1C-74-D6-9F-B3-07",
             "1C-74-D6-9F-B3-07",
             "1C-74-D6-9F-B3-07",
             "1C-74-D6-9F-B3-07",
             "1C-74-D6-9F-B3-07",
             "1C-74-D6-9F-B3-07"
         )
        private val rssi = arrayOf(
            "20 db",
            "-81 db",
            "54 db",
            "-12 db",
            "-90 db",
            "-10 db",
            "-10 db",
            "-10 db",
            "-10 db",
            "-10 db",
            "-10 db",
            "-10 db",
            "-10 db",
            "-10 db",
            "-10 db",
            "-10 db",

        )
        private val time = arrayOf(
                2.0,
                3.6,
                7.8,
                13.0,
                2.2,
                1.0,
                6.0,
                4.8,
                2.2,
                2.4,
                6.2,
                14.0,
                12.6,
                6.4,
                8.4,
                13.8,
        )
        var device: ArrayList<Double> = ArrayList<Double>()

        fun genDevice()
        {
            for(i in 2..17)
            {
                device.add(i*1.0)
            }
        }


        fun genData(n: Int): ArrayList<Data>{
            genDevice()
            val dataArray = ArrayList<Data>(n)
            for(i in 0..n)
            {
                dataArray.add(Data(mac[i],rssi[i],device[i],time[i]))
            }
            return dataArray
        }

    }
}
