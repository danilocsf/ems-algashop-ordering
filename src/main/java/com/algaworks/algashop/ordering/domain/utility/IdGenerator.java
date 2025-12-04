package com.algaworks.algashop.ordering.domain.utility;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedEpochRandomGenerator;
import io.hypersistence.tsid.TSID;

import java.util.UUID;

public class IdGenerator {

    private static final TimeBasedEpochRandomGenerator timeBasedEpochRandomGenerator
            = Generators.timeBasedEpochRandomGenerator();

    private static final TSID.Factory tsidFactroy = TSID.Factory.INSTANCE;

    private IdGenerator() {
    }

    public static UUID generateTimeBasedUUID() {
        return timeBasedEpochRandomGenerator.generate();
    }

    /*
     * Para funcionar corretmaente em produçõa, com diversas instâncias de um microserviço
     * essas variáveis de ambiente precisarão serem informadas
     * TSID_NODE
     * TSID_NODE_COUNT
     */
    public static TSID gererateTSID() {
        return tsidFactroy.generate();
    }

}