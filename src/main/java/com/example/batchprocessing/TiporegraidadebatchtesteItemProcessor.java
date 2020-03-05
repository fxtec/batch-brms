package com.example.batchprocessing;

import drools.Retorno;
import drools.tiporegraidadebatchteste;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import output.web.servicos.RegraService;
import output.web.servicos.RequestRegra;
import output.web.servicos.RequestTipo;

public class TiporegraidadebatchtesteItemProcessor implements ItemProcessor<tiporegraidadebatchteste, Retorno> {

    private static final Logger log = LoggerFactory.getLogger(TiporegraidadebatchtesteItemProcessor.class);

    @Autowired
    private RegraService regraService;

    @Override
    public Retorno process(final tiporegraidadebatchteste tiporegraidadebatchteste) throws Exception {
        RequestRegra<tiporegraidadebatchteste> request = new RequestRegra<>();
        request.setVariaveis(tiporegraidadebatchteste);
        return regraService.regratiporegraidadebatchteste(request);
    }

}
