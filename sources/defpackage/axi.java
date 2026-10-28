package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class axi implements axj {
    private final /* synthetic */ int $cid;
    static final axi b = new axi(1);
    static final axi a = new axi(0);

    private axi(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003f  */
    @Override // defpackage.axj
    public final int a(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        if (this.$cid != 0) {
            boolean z = false;
            for (int i4 = 0; i4 < i2; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                if (directionality == 0) {
                    z = true;
                } else if (directionality == 1 || directionality == 2) {
                    return 0;
                }
            }
            return z ? 1 : 2;
        }
        i3 = 2;
        for (int i5 = 0; i5 < i2 && i3 == 2; i5++) {
            byte directionality2 = Character.getDirectionality(charSequence.charAt(i5));
            if (directionality2 == 0) {
                i3 = 1;
                continue;
            } else if (directionality2 != 1 && directionality2 != 2) {
                switch (directionality2) {
                    case 14:
                    case 15:
                        i3 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        i3 = 2;
                        continue;
                }
            }
        }
        return i3;
    }
}
