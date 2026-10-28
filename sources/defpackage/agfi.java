package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agfi extends agdg {
    final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agfi(agfm agfmVar, CharSequence charSequence, String str) {
        super(agfmVar, charSequence);
        this.g = str;
    }

    @Override // defpackage.agdg
    public final int a(int i) {
        return i + this.g.length();
    }

    @Override // defpackage.agdg
    public final int b(int i) {
        String str = this.g;
        CharSequence charSequence = this.b;
        int length = charSequence.length();
        int length2 = str.length();
        int i2 = length - length2;
        while (i <= i2) {
            for (int i3 = 0; i3 < length2; i3++) {
                if (charSequence.charAt(i3 + i) != str.charAt(i3)) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }
}
