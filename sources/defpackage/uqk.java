package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uqk implements tae {
    private final /* synthetic */ int $cid;

    public /* synthetic */ uqk(int i) {
        this.$cid = i;
    }

    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                agrf agrfVar = uql.a;
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                alwu alwuVar = (alwu) obj;
                if ((alwuVar.b & 8) != 0) {
                    akll akllVar = alwuVar.e;
                    if (akllVar == null) {
                        akllVar = akll.a;
                    }
                    int iAS = a.aS(akllVar.c);
                    if (iAS != 0 && iAS == 3) {
                        ((agrc) ((agrc) xxd.a.b().i(agso.a, "MDX.player.director")).k("com/google/android/libraries/youtube/mdx/player/MdxDirector", "remoteControlInitiatedSetPlayback", 809, "MdxDirector.java")).t("RCI set playback command failed.");
                    }
                }
                agrx agrxVar = agso.a;
                break;
            case 4:
                break;
            case 5:
                int i = ycj.G;
                if (!((Boolean) obj).booleanValue()) {
                    agrx agrxVar2 = agso.a;
                }
                break;
            case 6:
                ((Boolean) obj).booleanValue();
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            default:
                break;
        }
    }
}
