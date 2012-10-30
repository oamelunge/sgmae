package com.saguapac.sgmae.acciones;

import javax.ejb.Local;

@Local
public interface Authenticator {

    boolean authenticate();

}
