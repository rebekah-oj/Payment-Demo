package com.paymennt.Payment.Demo.util;

import com.paymennt.Payment.Demo.dto.KYCCheckResponseDTO;
import com.paymennt.Payment.Demo.dto.UserDTO;
import com.paymennt.Payment.Demo.response.CheckKYCResponse;
import com.paymennt.Payment.Demo.model.KYCDetails;
import com.paymennt.Payment.Demo.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public abstract class MoneyMapper {

    // can't use mapstruct here
    public static User toUser(UserDTO dto) {
        return new User(dto.getTroperialUserHandle(),
                dto.getFirstName(),
                dto.getLastName(),
                dto.getStreetAddress1(),
                dto.getStreetAddress2(),
                dto.getCity(),
                dto.getStateIso2(),
                dto.getPostalCode(),
                dto.getPhone(),
                dto.getEmail(),
                dto.getFullSSN(),
                dto.getCryptoAddress(),
                dto.getBirthDate(),
                dto.getCountryIso2()
        );
    }

    public abstract KYCDetails toKycResponse(CheckKYCResponse checkKYCResponse);

    public abstract KYCCheckResponseDTO toKycResponseDTO(KYCDetails kycDetails);
}

