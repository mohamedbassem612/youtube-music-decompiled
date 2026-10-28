package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mie extends fgv {
    final mig a;
    public final BitSet d;
    private final String[] e;

    public mie(fhd fhdVar, mig migVar) {
        super(fhdVar, migVar);
        this.e = new String[]{"children", "collectionDisposable", "collectionType", "commandResolver", "conversionContext", "dataLayerSelector", "enableDdcDelayedGetElementByIndex", "enableDebugger", "enableFlowLayoutReplaceLinearLayout", "logger", "onScrollBeganDraggingCommand", "onScrollCommand", "onScrollDidStopCommand", "scrollToItemCommandHandler"};
        BitSet bitSet = new BitSet(14);
        this.d = bitSet;
        this.a = migVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(14, this.d, this.e);
        return this.a;
    }
}
