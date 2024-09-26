import com.google.android.gms.common.internal.safeparcel.SafeParcelable.NULL


data class User(
    val firstName: String = "",
    val lastName: String = "",
    val email: String = "",
    val password: String = "",
    val address: String? = NULL,
    val price: String?=NULL,
    val portname:String? = NULL


    )