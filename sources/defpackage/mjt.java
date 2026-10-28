package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mjt extends fgv {
    final mjv a;
    public final BitSet d;
    private final String[] e;

    public mjt(fhd fhdVar, mjv mjvVar) {
        super(fhdVar, mjvVar);
        this.e = new String[]{"blockingScheduler", "commandResolver", "conversionContext", "dataLayerSelector", "editableTextType", "enableAndroidEditableTextRestrictEmojis", "logger", "onBlurCommandFuture", "onChangeCommandFuture", "onFocusCommandFuture", "onTextInputActionCommandFuture", "styleRunExtensionConverters", "typefaceProvider", "uiThreadScheduler"};
        BitSet bitSet = new BitSet(14);
        this.d = bitSet;
        this.a = mjvVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(14, this.d, this.e);
        return this.a;
    }
}
