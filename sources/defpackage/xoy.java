package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.media.interfaces.QoeError;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xoy implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xoy(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, zki] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, xzc] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, xzc] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, xzc] */
    @Override // java.lang.Runnable
    public final void run() {
        Uri uriBuild;
        int i = 18;
        final int i2 = 0;
        final int i3 = 1;
        switch (this.$cid) {
            case 0:
                ajwo ajwoVar = ((amyb) this.b).h;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                xpc xpcVar = (xpc) this.a;
                xpcVar.d.a(ajwoVar);
                Context context = xpcVar.e;
                aeez aeezVar = xpcVar.h;
                aefb aefbVarA = aeezVar.a();
                aefbVarA.k(context.getString(R.string.mdx_connection_error_snackbar));
                aefbVarA.j();
                aeezVar.d(aefbVarA.b());
                return;
            case 1:
                adhg adhgVar = (adhg) this.b;
                if (adhgVar.a) {
                    return;
                }
                xkd xkdVar = (xkd) this.a;
                xka xkaVarF = xkdVar.f(xnf.class, null, new xnb(0));
                xkaVarF.d(xne.class);
                xkaVarF.c(xng.class);
                xka xkaVarF2 = xkdVar.f(xmy.class, null, new xnb(1));
                xkaVarF2.d(xnh.class);
                xkaVarF2.c(xng.class);
                xka xkaVarF3 = xkdVar.f(xmz.class, null, new xnb(1));
                xkaVarF3.d(xnh.class);
                xkaVarF3.c(xng.class);
                xka xkaVarF4 = xkdVar.f(xna.class, null, new xnb(1));
                xkaVarF4.d(xnh.class);
                xkaVarF4.c(xng.class);
                xkdVar.b(xnf.class, "mdx_cs");
                xkdVar.b(xne.class, "mdx_cr");
                xkdVar.b(xng.class, "mdx_off");
                xkdVar.b(xnh.class, "mdx_sc");
                xkdVar.b(xmy.class, "mdx_ccs");
                xkdVar.b(xmz.class, "mdx_ccp");
                xkdVar.b(xna.class, "mdx_ccst");
                adhgVar.a = true;
                return;
            case 2:
                agrx agrxVar = agso.a;
                ((dhp) ((xqx) this.b).a).gz((dhq) this.a);
                return;
            case 3:
                xsy xsyVar = ((xsx) this.a).b;
                xtr xtrVar = xsyVar.f;
                Object obj = this.b;
                if (xtrVar != obj || ((xtr) obj).c) {
                    return;
                }
                xsyVar.c.i((azs) obj);
                return;
            case 4:
                ((yae) ((yaa) this.a).a).e.m(((JSONObject) this.b).toString());
                return;
            case 5:
                Iterator it = ((ycp) this.b).c.iterator();
                while (it.hasNext()) {
                    ((xzf) it.next()).g(this.a);
                }
                return;
            case 6:
                Iterator it2 = ((ycp) this.b).c.iterator();
                while (it2.hasNext()) {
                    ((xzf) it2.next()).jv(this.a);
                }
                return;
            case 7:
                Iterator it3 = ((ycp) this.b).c.iterator();
                while (it3.hasNext()) {
                    ((xzf) it3.next()).h(this.a);
                }
                return;
            case 8:
                ((ygx) this.a).q.j((String) this.b);
                zhq zhqVar = zhq.ABR;
                return;
            case 9:
                ((xxy) this.b).a((xhn) this.a);
                return;
            case 10:
                yha yhaVar = (yha) this.a;
                yhaVar.d();
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                ajbt ajbtVar = (ajbt) ((aihf) this.b).build();
                ajbtVar.getClass();
                alouVar.d = ajbtVar;
                alouVar.c = 404;
                yhaVar.d.b((alou) alosVar.build());
                return;
            case 11:
                final Object obj2 = this.b;
                ((yoz) this.a).a(new uny(new avne() { // from class: yox
                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ywn] */
                    @Override // defpackage.avne
                    public final void a(Object obj3, Object obj4) {
                        if (i2 != 0) {
                            obj2.l((String) obj3, (String) obj4);
                        } else {
                            ((zgj) obj2).M((String) obj3, (String) obj4, 2);
                        }
                    }
                }, i));
                return;
            case 12:
                final Object obj3 = this.b;
                obj3.getClass();
                ((yoz) this.a).a(new uny(new avne() { // from class: yox
                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ywn] */
                    @Override // defpackage.avne
                    public final void a(Object obj4, Object obj5) {
                        if (i3 != 0) {
                            obj3.l((String) obj4, (String) obj5);
                        } else {
                            ((zgj) obj3).M((String) obj4, (String) obj5, 2);
                        }
                    }
                }, i));
                return;
            case 13:
                int i4 = yqf.m;
                zjr zjrVar = ((yqe) this.b).a;
                Object obj4 = this.a;
                try {
                    try {
                        if (((yqd) obj4).e.io().aS()) {
                            Uri uri = ((yqd) obj4).a;
                            agkz agkzVar = yti.a;
                            uriBuild = uri.buildUpon().appendQueryParameter("cmo", "td=a1.googlevideo.com").build();
                        } else {
                            uriBuild = ((yqd) obj4).a;
                        }
                        byi byiVar = new byi(uriBuild, 0L, -1L, null);
                        if (zjrVar.cI()) {
                            byh byhVar = new byh(byiVar);
                            ypp yppVarA = ypq.a();
                            yppVarA.j(tok.MEDIA_ONESIE_BANDAID_CONNECTION_OPENER);
                            byhVar.k = yppVarA.a();
                            byiVar = byhVar.a();
                        }
                        ((yqd) obj4).b().b(byiVar);
                        ((yqd) obj4).g(((yqd) obj4).b().c());
                        ((yqd) obj4).e();
                    } catch (byt unused) {
                        ((yqd) obj4).d();
                    }
                    try {
                        return;
                    } catch (byt unused2) {
                        return;
                    }
                } finally {
                    try {
                        ((yqd) obj4).b().f();
                        break;
                    } catch (byt unused3) {
                    }
                }
                break;
            case 14:
                ((yqo) this.a).h((Exception) this.b);
                return;
            case 15:
                ((yqo) this.b).f((QoeError) this.a);
                return;
            case 16:
                ((yqo) this.a).e((yqq) this.b);
                return;
            case 17:
                ((ytv) ((yrv) this.b).a.io()).F((yrr) this.a);
                return;
            case 18:
                ((ytv) this.a).o((yxk) this.b);
                return;
            case 19:
                ((ytv) this.a).J((acca) this.b);
                return;
            default:
                ((ytv) this.a).w(this.b);
                return;
        }
    }

    public /* synthetic */ xoy(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
