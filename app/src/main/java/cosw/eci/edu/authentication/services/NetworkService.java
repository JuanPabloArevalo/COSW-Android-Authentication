package cosw.eci.edu.authentication.services;

import cosw.eci.edu.authentication.model.LoginWrapper;
import cosw.eci.edu.authentication.model.Token;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;



/**
 * Created by JuanArevaloMerchan on 18/04/2018.
 */

public interface  NetworkService {

    @POST( "user/login" )
    Call<Token> login(@Body LoginWrapper user  );
}
