package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mjx extends fgv {
    final mka a;
    public final BitSet d;
    private final String[] e;

    public mjx(fhd fhdVar, mka mkaVar) {
        super(fhdVar, mkaVar);
        this.e = new String[]{"commandResolver", "conversionContext", "dataLayerSelector", "editableTextType", "enableEmojiCompat", "imageSourceExtensionResolver", "logger", "onBlurCommandFuture", "onChangeCommandFuture", "onFocusCommandFuture", "onTextInputActionCommandFuture", "styleRunExtensionConverters", "typefaceProvider"};
        BitSet bitSet = new BitSet(13);
        this.d = bitSet;
        this.a = mkaVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(13, this.d, this.e);
        return this.a;
    }
}
