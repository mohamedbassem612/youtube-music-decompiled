package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aatx {
    public static final agrf g = agrf.h("com/google/android/libraries/youtube/offline/ui/DefaultPlaylistDownloadController");
    public final aany h;
    public final aauk i;
    public final tbt j;
    public final aanb k;

    public aatx(aany aanyVar, aanb aanbVar, aauk aaukVar, tbt tbtVar) {
        this.h = aanyVar;
        this.k = aanbVar;
        this.i = aaukVar;
        this.j = tbtVar;
    }

    public int a() {
        return 0;
    }

    public void c() {
        this.k.b().t();
    }

    protected aofg h(boolean z) {
        return aofg.b;
    }

    protected aofg i(aogf aogfVar, int i) {
        return aofg.b;
    }

    public final void j(String str, aogf aogfVar, int i) {
        aauk aaukVar = this.i;
        if (!aaukVar.G() || i == 0) {
            this.k.b().i().m(str, null);
            return;
        }
        try {
            String strG = wfs.g(i, str);
            if (aaukVar.v()) {
                this.h.d(new aajl(strG, 10));
            }
            aany aanyVar = this.h;
            aihf aihfVarCreateBuilder = aofh.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
            aofhVar.c = 2;
            aofhVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
            strG.getClass();
            aofhVar2.b |= 2;
            aofhVar2.d = strG;
            aofg aofgVarI = i(aogfVar, 1);
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
            aofgVarI.getClass();
            aofhVar3.e = aofgVarI;
            aofhVar3.b |= 4;
            aanyVar.a((aofh) aihfVarCreateBuilder.build());
        } catch (aaob e) {
            ((agrc) ((agrc) ((agrc) g.b()).j(e)).k("com/google/android/libraries/youtube/offline/ui/DefaultPlaylistDownloadController", "removePlaylist", (char) 162, "DefaultPlaylistDownloadController.java")).w("[Offline] Couldn't delete playlist through orchestration: %s", str);
        }
    }

    public final boolean k(String str, long j, boolean z, int i) {
        int iA;
        aauk aaukVar = this.i;
        if (!aaukVar.G() || !aaukVar.a.l(11, 45358948L, false) || i == 0 || (iA = a()) == 0) {
            return this.k.b().i().s(str, j);
        }
        try {
            aihf aihfVarCreateBuilder = aofh.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
            aofhVar.c = 3;
            aofhVar.b |= 1;
            String strG = wfs.g(i, str);
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
            strG.getClass();
            aofhVar2.b |= 2;
            aofhVar2.d = strG;
            aofg aofgVarH = h(z);
            aihfVarCreateBuilder.copyOnWrite();
            aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
            aofgVarH.getClass();
            aofhVar3.e = aofgVarH;
            aofhVar3.b |= 4;
            aofh aofhVar4 = (aofh) aihfVarCreateBuilder.build();
            aaqn aaqnVarB = this.k.b();
            aaew aaewVarD = aaqnVarB.d();
            aamj aamjVarE = aaewVarD != null ? aaewVarD.e(str) : null;
            aajg.b(aofhVar4, aamjVarE != null ? agke.n(aamjVarE.b) : agpi.a, this.h.a(aofhVar4), this.j, aaqnVarB, iA);
            return true;
        } catch (aaob e) {
            ((agrc) ((agrc) ((agrc) g.b()).j(e)).k("com/google/android/libraries/youtube/offline/ui/DefaultPlaylistDownloadController", "syncPlaylist", (char) 213, "DefaultPlaylistDownloadController.java")).w("[Offline] Couldn't refresh playlist through orchestration: %s", str);
            return false;
        }
    }
}
