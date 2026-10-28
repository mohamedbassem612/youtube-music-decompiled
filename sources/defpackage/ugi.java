package defpackage;

import android.graphics.Bitmap;
import com.google.cardboard.sdk.R;
import j$.time.Duration;
import j$.time.Instant;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ugi {
    public static final ajai a(apvl apvlVar) {
        if (apvlVar == null) {
            return null;
        }
        if ((apvlVar.b & 16) == 0) {
            apvlVar = null;
        }
        if (apvlVar == null) {
            return null;
        }
        ajai ajaiVar = apvlVar.f;
        return ajaiVar == null ? ajai.a : ajaiVar;
    }

    public static Bitmap b(Bitmap bitmap) {
        int i;
        int i2;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double d = height;
        double d2 = width;
        if (d / d2 > 1.0d) {
            i2 = (int) d2;
            i = width;
        } else {
            i = (int) d;
            i2 = height;
        }
        try {
            return Bitmap.createBitmap(bitmap, (width - i) / 2, (height - i2) / 2, i, i2);
        } catch (OutOfMemoryError e) {
            zvp.b(zvn.b, zvm.f, "[ShortsCreation][Android][Camera]Out of memory when creating bitmap", e);
            return null;
        }
    }

    public static qua c(vxz vxzVar) {
        qtz qtzVar = new qtz();
        qtzVar.aE(vxzVar.l(0, 45430152L, false));
        qtzVar.aD(vxzVar.l(2, 45614356L, false));
        qtzVar.P(vxzVar.m(3, 45621117L));
        qtzVar.aK(vxzVar.m(6, 45623021L));
        qtzVar.m(vxzVar.m(9, 45632049L));
        qtzVar.aj(vxzVar.m(11, 45632445L));
        qtzVar.K(vxzVar.m(12, 45632891L));
        qtzVar.R(vxzVar.m(13, 45633971L));
        qtzVar.O(vxzVar.m(15, 45641797L));
        qtzVar.aL(vxzVar.m(16, 45644632L));
        qtzVar.aw(vxzVar.m(114, 45802740L));
        qtzVar.an((int) vxzVar.c(0, 45658779L, 16L));
        qtzVar.aC(vxzVar.l(24, 45658074L, false));
        qtzVar.aM(vxzVar.l(23, 45657149L, false));
        qtzVar.aN(vxzVar.l(27, 45664616L, false));
        qtzVar.ax(vxzVar.l(29, 45667730L, false));
        qtzVar.n(vxzVar.l(30, 45669746L, false));
        qtzVar.av(vxzVar.l(28, 45665621L, false));
        qtzVar.ad(vxzVar.l(33, 45679443L, false));
        qtzVar.b(vxzVar.l(32, 45679038L, false));
        qtzVar.aH(vxzVar.l(35, 45679813L, false));
        qtzVar.aA((int) vxzVar.c(1, 45681869L, 0L));
        qtzVar.i(vxzVar.l(36, 45680994L, false));
        qtzVar.c(vxzVar.l(38, 45681780L, false));
        qtzVar.T(vxzVar.l(40, 45683023L, false));
        qtzVar.D(vxzVar.l(41, 45683216L, false));
        qtzVar.h(vxzVar.l(44, 45684534L, false));
        qtzVar.H(vxzVar.l(43, 45683844L, false));
        qtzVar.M(vxzVar.l(45, 45685943L, false));
        qtzVar.aF(vxzVar.l(46, 45687597L, false));
        qtzVar.ae(vxzVar.l(49, 45691382L, false));
        qtzVar.aJ(vxzVar.l(50, 45692484L, false));
        qtzVar.aG(vxzVar.l(53, 45696605L, false));
        qtzVar.l(vxzVar.l(54, 45699430L, false));
        qtzVar.af(vxzVar.l(56, 45704099L, false));
        qtzVar.U(vxzVar.l(57, 45704323L, false));
        qtzVar.o(vxzVar.l(58, 45706014L, false));
        qtzVar.A(vxzVar.l(60, 45707430L, false));
        qtzVar.j(vxzVar.l(61, 45708038L, false));
        qtzVar.aQ(vxzVar.l(62, 45710549L, false));
        qtzVar.V(vxzVar.l(70, 45717070L, false));
        qtzVar.au(vxzVar.l(63, 45711100L, false));
        qtzVar.I(vxzVar.l(74, 45719609L, false));
        qtzVar.aP(vxzVar.l(64, 45712319L, false));
        qtzVar.G(vxzVar.l(66, 45714337L, false));
        qtzVar.aq(vxzVar.l(68, 45715408L, false));
        qtzVar.J(vxzVar.l(67, 45714995L, false));
        qtzVar.e(vxzVar.l(65, 45713341L, false));
        qtzVar.aB(vxzVar.l(71, 45717071L, false));
        qtzVar.al(vxzVar.l(72, 45717641L, false));
        qtzVar.Q(vxzVar.l(119, 45825413L, false));
        qtzVar.S(vxzVar.l(69, 45716770L, false));
        qtzVar.ay(vxzVar.l(73, 45718958L, false));
        qtzVar.d(vxzVar.l(75, 45721383L, false));
        qtzVar.ab((int) vxzVar.c(4, 45721460L, 0L));
        qtzVar.aI(vxzVar.l(77, 45723105L, false));
        qtzVar.q(vxzVar.l(78, 45724352L, false));
        qtzVar.ak(vxzVar.l(76, 45721490L, false));
        qtzVar.f(Duration.ofMillis(vxzVar.c(5, 45724541L, 0L)));
        qtzVar.z(vxzVar.l(79, 45725000L, false));
        qtzVar.r(vxzVar.l(80, 45729823L, false));
        qtzVar.E(vxzVar.l(82, 45731227L, false));
        qtzVar.ac(vxzVar.l(81, 45731194L, false));
        qtzVar.ai(vxzVar.l(85, 45732740L, false));
        qtzVar.u(vxzVar.l(84, 45732505L, false));
        qtzVar.ag(vxzVar.l(86, 45734984L, false));
        qtzVar.Z(Duration.ofMillis(vxzVar.c(6, 45738856L, 0L)));
        qtzVar.v(vxzVar.l(87, 45735464L, false));
        qtzVar.Y(vxzVar.l(88, 45740389L, false));
        qtzVar.ar(vxzVar.l(89, 45743379L, false));
        qtzVar.aa(vxzVar.c(8, 45745480L, 0L) + 10);
        qtzVar.p(vxzVar.l(91, 45743870L, false));
        qtzVar.ah(vxzVar.l(90, 45743865L, false));
        qtzVar.t(vxzVar.l(92, 45744375L, false));
        qtzVar.ap(vxzVar.l(93, 45744652L, false));
        qtzVar.az(vxzVar.c(7, 45744668L, 0L) + 33333);
        qtzVar.ao(vxzVar.l(94, 45745820L, false));
        qtzVar.x(vxzVar.l(95, 45746470L, false));
        qtzVar.W(vxzVar.l(96, 45749505L, false));
        qtzVar.at(vxzVar.l(97, 45753578L, false));
        qtzVar.C(vxzVar.l(98, 45755302L, false));
        qtzVar.am(vxzVar.l(99, 45755747L, false));
        qtzVar.B(vxzVar.l(101, 45765003L, false));
        qtzVar.aO(vxzVar.l(100, 45762702L, false));
        qtzVar.g();
        qtzVar.N(vxzVar.l(102, 45769441L, false));
        qtzVar.s(vxzVar.l(107, 45773531L, false));
        qtzVar.y(vxzVar.l(109, 45776185L, false));
        qtzVar.as(vxzVar.m(110, 45779367L));
        qtzVar.X();
        qtzVar.F(vxzVar.l(115, 45817176L, false));
        qtzVar.L(vxzVar.l(116, 45820511L, false));
        qtzVar.w(vxzVar.l(121, 45831663L, false));
        qtzVar.k(vxzVar.l(R.styleable.AppCompatTheme_windowNoTitle, 45848602L, false));
        return qtzVar.a();
    }

    public static void d(Throwable th) {
        if (th instanceof avmw) {
            List<Throwable> list = ((avmw) th).a;
            for (Throwable th2 : list) {
                HashSet hashSet = new HashSet();
                for (Throwable cause = th2; cause != null && !hashSet.contains(cause); cause = cause.getCause()) {
                    hashSet.add(cause);
                }
                if (hashSet.containsAll(list)) {
                    g(th2);
                }
            }
            g(new tzl(th, null));
        }
        g(th);
    }

    public static IllegalStateException e(String str) {
        return new IllegalStateException("<N0_P!!>".concat(String.valueOf(str)));
    }

    public static final boolean f(aret aretVar, Instant instant, Duration duration) {
        return instant.minusSeconds(duration.toSeconds()).toEpochMilli() >= aretVar.getLastUpdatedClientTimestampMs().longValue();
    }

    private static void g(Throwable th) throws Exception {
        if (!(th instanceof Exception)) {
            throw new tzl(th, null);
        }
        throw ((Exception) th);
    }
}
