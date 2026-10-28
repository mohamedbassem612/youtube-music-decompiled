package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aof implements awqg {
    private final /* synthetic */ int $cid;

    public aof(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        Object context = null;
        switch (this.$cid) {
            case 0:
                if (((aoe) ahs.g((ajm) obj, aoo.a)) != null) {
                    throw null;
                }
                aog.a("LocalImageVectorCache");
                throw new awmh();
            case 1:
                aoe aoeVar = (aoe) ahs.g((ajm) obj, aoo.a);
                if (aoeVar == null || (context = aoeVar.getContext()) == null) {
                    aog.a("LocalContext");
                    throw new awmh();
                }
                return context;
            case 2:
                if (((aoe) ahs.g((ajm) obj, aoo.a)) != null) {
                    throw null;
                }
                aog.a("LocalResourceIdCache");
                throw new awmh();
            case 3:
                context = (aoe) ahs.g((ajm) obj, aoo.a);
                if (context == null) {
                    aog.a("LocalView");
                    throw new awmh();
                }
                return context;
            case 4:
                if (((aoe) ahs.g((ajm) obj, aoo.a)) != null) {
                    throw null;
                }
                return context;
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                throw null;
            case 8:
                throw null;
            case 9:
                throw null;
            case 10:
                throw null;
            case 11:
                throw null;
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                throw null;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
