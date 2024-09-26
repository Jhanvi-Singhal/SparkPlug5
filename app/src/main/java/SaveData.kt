import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley



fun SaveData(data:String, context: Context) {
    var url =
        "https://script.google.com/macros/s/AKfycbymxoLy3iPU8HgcLAagw4gCVbqMMEprLt3Zr_RotDJ06y3gKFzadAdwCEqQcJrdxjFC/exec"
    url = url + "action=create&address=" + data
    val stringRequest = StringRequest(
        Request.Method.GET, url,
        { response ->
            Toast.makeText(context, response, Toast.LENGTH_SHORT).show()
        },
        { error ->
            Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
        }
    )

    val queue = Volley.newRequestQueue(context)
    queue.add(stringRequest)
}