package africa.semicolon.jijimarket.services;

import africa.semicolon.jijimarket.dtos.requests.RegisterListerRequest;
import africa.semicolon.jijimarket.dtos.responses.RegisterListerResponse;

public interface ListerService {

    public RegisterListerResponse registerLister(RegisterListerRequest request);
}
