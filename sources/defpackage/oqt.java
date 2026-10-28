package defpackage;

import com.youtube.android.libraries.elements.StatusOr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oqt implements oon {
    private final orf a;
    private final agke b;

    public oqt(orf orfVar, agke agkeVar) {
        this.a = orfVar;
        this.b = agkeVar;
    }

    @Override // defpackage.oon
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.oon
    public final atgg b(int i) {
        byte[] bArr;
        StatusOr statusOrElementBytesByKey = this.a.elementBytesByKey((String) this.b.get(i));
        if (!statusOrElementBytesByKey.hasValue || (bArr = (byte[]) statusOrElementBytesByKey.value) == null) {
            int i2 = atgg.l;
            return atge.a;
        }
        atgg atggVar = new atgg();
        atggVar.bH(bArr);
        return atggVar;
    }
}
