package com.alves.backmoments.application.ports.out.moment;

import com.alves.backmoments.application.domain.models.Moment;

public interface SaveMomentPort {

    Moment save(Moment moment);
}
