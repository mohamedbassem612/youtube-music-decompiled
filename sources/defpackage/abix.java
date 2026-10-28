package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abix {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public abix(tpq tpqVar, abvn abvnVar) {
        awkx awkxVar = new awkx();
        this.b = awkxVar;
        avmm avmmVar = new avmm();
        this.d = avmmVar;
        avlh avlhVarP = tpqVar.d().p();
        int i = 19;
        int i2 = 10;
        avlh avlhVarW = abvnVar.Q() == null ? avlh.w() : abvnVar.Q().H(new ablh(1)).p().x(new yqz(i2)).H(new aalc(i));
        avlh avlhVarH = avlhVarW.ac(avlhVarP.H(new aalc(18)).p(), new abiw(0)).x(new yqz(i2)).H(new aalc(i));
        this.c = avlhVarH;
        avlh.I(awkxVar, avlhVarH);
        avlh avlhVarC = avlh.J(awkxVar, avlhVarP.H(new aalc(20)), avlhVarW).p().u(new abid(this, 15)).ax().c();
        this.e = avlhVarC;
        avmmVar.c(avlhVarC.aj());
    }

    public final void a(boolean z) {
        int i = 8;
        if (this.a && z) {
            i = 0;
        }
        ((View) this.d).setVisibility(i);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[Catch: all -> 0x00c0, TryCatch #0 {, blocks: (B:31:0x0086, B:35:0x0098, B:37:0x00a4, B:33:0x0091), top: B:56:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[Catch: all -> 0x00c0, TryCatch #0 {, blocks: (B:31:0x0086, B:35:0x0098, B:37:0x00a4, B:33:0x0091), top: B:56:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    public final void b(boolean z) {
        boolean z2;
        synchronized (this.c) {
            if (this.a == z) {
                return;
            }
            this.a = z;
            synchronized (this.c) {
            }
            Object obj = this.d;
            ardj ardjVar = ardj.EFFECT_SUBPACKAGE_ID_EXPRESSIVE;
            vae vaeVar = (vae) obj;
            Optional optionalS = vaeVar.s(ardjVar);
            if (true == optionalS.isPresent()) {
                ((abix) optionalS.get()).c();
                optionalS = Optional.ofNullable(null);
            }
            String str = (String) optionalS.orElse(null);
            if (uxp.c(str)) {
                ardjVar = ardj.EFFECT_SUBPACKAGE_ID_PRESET;
                Optional optionalS2 = vaeVar.s(ardjVar);
                if (true == optionalS2.isPresent()) {
                    ((abix) optionalS2.get()).c();
                    optionalS2 = Optional.ofNullable(null);
                }
                str = (String) optionalS2.orElse(null);
                if (uxp.c(str)) {
                    ardjVar = ardj.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
                    Optional optionalS3 = vaeVar.s(ardjVar);
                    if (true == optionalS3.isPresent()) {
                        ((abix) optionalS3.get()).c();
                        optionalS3 = Optional.ofNullable(null);
                    }
                    str = (String) optionalS3.orElse(null);
                }
            }
            synchronized (vaeVar.l) {
                if (str != null) {
                    if (!Objects.equals(str, ((vae) obj).j)) {
                        ((vae) obj).j = str;
                        ((vae) obj).k = ardjVar;
                        z2 = true;
                    } else if (((vae) obj).k != ardjVar) {
                        ((vae) obj).j = str;
                        ((vae) obj).k = ardjVar;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else if (((vae) obj).k != ardjVar) {
                    ((vae) obj).j = str;
                    ((vae) obj).k = ardjVar;
                    z2 = true;
                } else {
                    z2 = false;
                }
                throw th;
            }
            if (z2) {
                List list = vaeVar.i;
                uxp uxpVarA = uxp.a(null, vaeVar.t());
                if (uxpVarA != null) {
                    yno.fF(vaeVar.f, uxpVarA, false);
                }
                vaeVar.d = true;
                vaeVar.y();
            }
        }
    }

    final void c() {
        synchronized (this.c) {
        }
    }

    public abix(ulj uljVar) {
        uljVar.getClass();
        this.d = uljVar;
        this.b = new roq(new uvq(null));
        this.e = new avmm();
        this.c = new uvs(this);
    }

    public abix(vae vaeVar) {
        new HashSet();
        new HashSet();
        this.e = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.a = false;
        this.c = new Object();
        this.d = vaeVar;
    }

    public abix(wzb wzbVar, View view) {
        this.e = wzbVar;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.empty_state_message_stub);
        viewStub.setLayoutResource(wzbVar.a(5));
        viewStub.inflate();
        View viewFindViewById = view.findViewById(R.id.empty_state_message);
        this.d = viewFindViewById;
        this.c = (TextView) viewFindViewById.findViewById(R.id.message);
        this.b = (TextView) viewFindViewById.findViewById(R.id.sub_message);
    }

    public abix(coy coyVar, boolean[] zArr) {
        this.b = coyVar;
        this.c = zArr;
        int i = coyVar.b;
        this.d = new boolean[i];
        this.e = new boolean[i];
    }
}
