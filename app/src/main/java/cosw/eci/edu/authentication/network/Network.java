package cosw.eci.edu.authentication.network;

import cosw.eci.edu.authentication.model.LoginWrapper;
import cosw.eci.edu.authentication.model.Token;

/**
 * Created by JuanArevaloMerchan on 18/04/2018.
 */

public interface Network {
    void login(LoginWrapper loginWrapper, RequestCallback<Token> requestCallback );
}
