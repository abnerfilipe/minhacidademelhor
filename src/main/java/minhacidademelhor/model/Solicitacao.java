package minhacidademelhor.model;

import java.util.Date;

enum Status{
    aberta, fechada
}

public class Solicitacao {
    private long id;
    private Date dataAbertura;
    private Usuario usuario;
    private Date dataResposta;
    private Date dataPrevistaSolucao;
    private Status status;
}
