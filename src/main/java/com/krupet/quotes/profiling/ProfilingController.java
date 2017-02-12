package com.krupet.quotes.profiling;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProfilingController implements ProfilingControllerMBean {

    private boolean enable;
}
