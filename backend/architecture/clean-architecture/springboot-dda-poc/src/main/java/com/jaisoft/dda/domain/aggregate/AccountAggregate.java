package com.jaisoft.dda.domain.aggregate;

import com.jaisoft.dda.domain.entity.ProfileEntity;
import com.jaisoft.dda.domain.entity.UserEntity;
import com.jaisoft.dda.domain.vo.AccountVO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Document
public class AccountAggregate {

    @Id
    private String accountId;

    @NotNull
    private ProfileEntity profileEntity;
    @NotNull
    private UserEntity userEntity;

    @NotNull
    private AccountVO accountVO;


    public AccountAggregate(UserEntity userEntity, ProfileEntity profileEntity ) {
        this.profileEntity = profileEntity;
        this.userEntity = userEntity;
    }
}
