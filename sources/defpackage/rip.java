package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rip implements btf {
    private static final agkj c = agkj.k(rim.a, "Video", rim.b, "Audio");
    private final rin d;
    private final qug e;
    private final ExoPlayer f;
    private final rim g;
    public final rbm b = new rbm("rip");
    private boolean h = false;
    public final rio a = new rio();

    public rip(ExoPlayer exoPlayer, rin rinVar, qug qugVar, rim rimVar) {
        this.d = rinVar;
        this.f = exoPlayer;
        this.e = qugVar;
        this.g = rimVar;
    }

    public final void B() {
        this.h = true;
    }

    @Override // defpackage.btf
    public final void k(bta btaVar) {
        audd auddVar;
        rbc rbcVar = new rbc(this.b, rbd.d);
        rbcVar.c();
        rbcVar.a = btaVar;
        rbcVar.a("%s Error from ExoPlayer, type=%s, message=%s", c.get(this.g), btaVar.a(), btaVar.getMessage());
        rio rioVar = this.a;
        synchronized (rioVar.a) {
            rioVar.d = btaVar;
        }
        int i = btaVar.a;
        if (i == 1003) {
            if ((btaVar.getCause() instanceof cct) && ((cct) btaVar.getCause()).a == 1) {
                return;
            } else {
                i = 1003;
            }
        }
        if (i == 4001 || i == 4003 || i == 1004) {
            this.d.aH();
        }
        rio rioVar2 = this.a;
        rioVar2.c();
        if (this.d.aI() && rioVar2.a() < 3 && rioVar2.b() < 5 && !this.h) {
            rbc rbcVar2 = new rbc(this.b, rbd.c);
            rbcVar2.c();
            rbcVar2.a = btaVar;
            rbcVar2.a("Recovering ExoPlayer, retryCount=%d, totalCount=%d", Integer.valueOf(rioVar2.a()), Integer.valueOf(rioVar2.b()));
            synchronized (rioVar2.a) {
                rioVar2.b++;
                rioVar2.c++;
            }
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                rbc rbcVar3 = new rbc(this.b, rbd.c);
                rbcVar3.a = e;
                rbcVar3.c();
                rbcVar3.a("Interrupted while sleeping to recover ExoPlayer", new Object[0]);
                Thread.currentThread().interrupt();
            }
            bth bthVar = this.f;
            bthVar.z();
            rin rinVar = this.d;
            rinVar.aG(bthVar.l());
            rinVar.aF();
            ((brs) bthVar).A(true);
            return;
        }
        quh quhVar = new quh(this.d.aD(), 1);
        qug qugVar = this.e;
        tge tgeVarA = quk.a();
        tgeVarA.b = btaVar;
        tgeVarA.c = quhVar;
        tgeVarA.e = String.format(Locale.US, "Error from ExoPlayer, type=%s, message=%s", btaVar.a(), btaVar.getMessage());
        aihf aihfVarCreateBuilder = aueb.a.createBuilder();
        rim rimVar = this.g;
        if (rimVar.equals(rim.a)) {
            int i2 = btaVar.a;
            if (i2 == 4001) {
                auddVar = audd.MEDIA_ENGINE_ERROR_TYPE_VIDEO_DECODER_INIT;
            } else {
                auddVar = i2 == 4003 ? audd.MEDIA_ENGINE_ERROR_TYPE_VIDEO_DECODER_FAILED : audd.MEDIA_ENGINE_ERROR_TYPE_UNKNOWN;
            }
        } else if (rimVar.equals(rim.b)) {
            int i3 = btaVar.a;
            if (i3 == 4001) {
                auddVar = audd.MEDIA_ENGINE_ERROR_TYPE_AUDIO_DECODER_INIT;
            } else {
                auddVar = i3 == 4003 ? audd.MEDIA_ENGINE_ERROR_TYPE_AUDIO_DECODER_FAILED : audd.MEDIA_ENGINE_ERROR_TYPE_AUDIO_PLAYBACK_INTERNAL;
            }
        } else {
            auddVar = audd.MEDIA_ENGINE_ERROR_TYPE_UNKNOWN;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aueb auebVar = (aueb) aihfVarCreateBuilder.instance;
        auebVar.c = auddVar.ap;
        auebVar.b |= 1;
        String strA = btaVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        aueb auebVar2 = (aueb) aihfVarCreateBuilder.instance;
        auebVar2.b |= 4;
        auebVar2.e = strA;
        tgeVarA.f((aueb) aihfVarCreateBuilder.build());
        qugVar.a(tgeVarA.e());
    }

    @Override // defpackage.btf
    public final void o() {
        rio rioVar = this.a;
        if (rioVar.a() > 0) {
            rbc rbcVar = new rbc(this.b, rbd.a);
            rbcVar.c();
            rbcVar.a = rioVar.c();
            rbcVar.a("Successfully recovered video from ExoPlayer error, retryCount=%d!", Integer.valueOf(rioVar.a()));
        }
        rioVar.d();
    }

    @Override // defpackage.btf
    public final /* synthetic */ void A() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gg(boolean z) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gh(boolean z) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gi(bsx bsxVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gk(btb btbVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gl(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void iE(brq brqVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void j(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void l(bta btaVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void p(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void s(btu btuVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void t(btz btzVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void u(float f) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void z(int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gf(bth bthVar, bte bteVar) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void gj(boolean z, int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void m(boolean z, int i) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void r(int i, int i2) {
    }

    @Override // defpackage.btf
    public final /* synthetic */ void n(btg btgVar, btg btgVar2, int i) {
    }
}
