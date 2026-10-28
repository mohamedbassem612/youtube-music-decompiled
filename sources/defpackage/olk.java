package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class olk implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ olk(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                boolean z = olp.a;
                return null;
            case 1:
                return new onu(false, null, (Exception) obj);
            case 2:
                boolean z2 = olp.a;
                return Boolean.TRUE;
            case 3:
                aihf builder = ((oiu) obj).toBuilder();
                builder.clear();
                return (oiu) builder.build();
            case 4:
                return Boolean.TRUE;
            case 5:
                return Boolean.FALSE;
            case 6:
                return ((oiu) obj).d;
            case 7:
                aihf builder2 = ((oiu) obj).toBuilder();
                builder2.copyOnWrite();
                ((oiu) builder2.instance).d = oiu.emptyProtobufList();
                return (oiu) builder2.build();
            case 8:
                return Boolean.TRUE;
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return Boolean.FALSE;
            case 12:
                return Boolean.TRUE;
            case 13:
                return Boolean.FALSE;
            case 14:
                return Boolean.TRUE;
            case 15:
                return Boolean.FALSE;
            case 16:
                return Boolean.TRUE;
            case 17:
                return Boolean.FALSE;
            case 18:
                return Boolean.TRUE;
            case 19:
                aihf builder3 = ((ojc) obj).toBuilder();
                builder3.clear();
                return (ojc) builder3.build();
            default:
                return Boolean.TRUE;
        }
    }
}
