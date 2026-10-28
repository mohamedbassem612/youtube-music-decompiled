package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zpc extends fgv {
    public final zpg a;
    public final BitSet d;
    private final String[] e;

    public zpc(fhd fhdVar, zpg zpgVar) {
        super(fhdVar, zpgVar);
        this.e = new String[]{"activity", "asyncImageLoader", "commandResolver", "conversionContext", "enableForceRemountCap", "enableMinimizedRemounting", "entityStoreFactory", "identityProvider", "innerTubeIconResolver", "interactionLogger", "logger", "mdeButtonController", "onBlurCommand", "onChangeCommand", "onFocusCommand", "onTextInputActionCommand", "suggestBottomSheetControllerFactory", "suggestClient", "suggestControllerFactory", "suggestEditableTextType", "suggestFetcherFactory", "typefaceProvider", "uiExecutor", "uiScheduler"};
        BitSet bitSet = new BitSet(24);
        this.d = bitSet;
        this.a = zpgVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(24, this.d, this.e);
        return this.a;
    }
}
