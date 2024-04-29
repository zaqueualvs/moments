package com.alves.backmoments.application.ports.out.moment;

import com.alves.backmoments.application.domain.models.Moment;

public interface UpdateMomentPort {

    Moment update(Moment moment);
}
