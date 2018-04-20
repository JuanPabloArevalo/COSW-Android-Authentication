package cosw.eci.edu.authentication.network;

import java.util.List;

import cosw.eci.edu.authentication.model.LoginWrapper;
import cosw.eci.edu.authentication.model.ToDo;
import cosw.eci.edu.authentication.model.Token;
import okhttp3.ResponseBody;

/**
 * Created by JuanArevaloMerchan on 18/04/2018.
 */

public interface Network {
    void login(LoginWrapper loginWrapper, RequestCallback<Token> requestCallback );

    public void getAllToDo(RequestCallback<List<ToDo>> requestCallback, String token);

    public void addToDo(ToDo todo, RequestCallback<ResponseBody> requestCallback , String token);
}
