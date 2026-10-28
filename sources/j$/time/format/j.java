package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends k {
    @Override // j$.time.format.k
    public final boolean b(char c, char c2) {
        return r.b(c, c2);
    }

    @Override // j$.time.format.k
    public final k d(String str, String str2, k kVar) {
        return new j(str, str2, kVar);
    }

    @Override // j$.time.format.k
    public final boolean e(CharSequence charSequence, int i, int i2) {
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!r.b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
