package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wft implements wfp {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, 1, 0, 0, 0, 2, 0, 0, 0, 1, 0, -1, -1, -1, -1, -1, -1, -1, 2, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 2, 0, -1, -1, -1, -1, 0, -1, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, -1, -1, -1, -1, -1};
    private final wfp b;

    public wft(wfp wfpVar) {
        this.b = wfpVar;
    }

    @Override // defpackage.wfp
    public final akve a(String str) {
        int length = str.length();
        int i = length & 3;
        if (length != 0 && i != 1 && i != 3) {
            int[] iArr = a;
            if (iArr[str.charAt(0) & 127] != -1) {
                char cCharAt = str.charAt(length - 1);
                if (iArr[cCharAt & 127] != -1 && (length < 6 || cCharAt != 'D' || str.charAt(length - 3) != '%' ? i == 0 : !(i != 2 ? length < 8 || i != 0 || iArr[str.charAt(length - 7) & 127] < 2 : iArr[str.charAt(length - 4) & 127] <= 0))) {
                    return this.b.a(str);
                }
            }
        }
        return null;
    }
}
