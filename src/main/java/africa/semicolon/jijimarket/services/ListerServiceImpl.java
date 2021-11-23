package africa.semicolon.jijimarket.services;

import africa.semicolon.jijimarket.data.repositories.ListerRepository;
import africa.semicolon.jijimarket.dtos.requests.RegisterListerRequest;
import africa.semicolon.jijimarket.dtos.responses.RegisterListerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Component
@Service
public class ListerServiceImpl implements ListerService{
    @Autowired
    private ListerRepository listerRepository;

    @Override
    public RegisterListerResponse registerLister(RegisterListerRequest request) {
        return null;
    }
}
