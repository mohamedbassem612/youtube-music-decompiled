package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.playlist.customthumbnail.CustomThumbnailCreationActivity;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class hna {
    public hna() {
    }

    public static Optional A(Optional optional, ixi ixiVar) {
        if (ixiVar.b().isEmpty()) {
            return optional;
        }
        aihf aihfVarCreateBuilder = ajta.a.createBuilder();
        agke agkeVarB = ixiVar.b();
        int size = agkeVarB.size();
        for (int i = 0; i < size; i++) {
            ajsy ajsyVar = (ajsy) agkeVarB.get(i);
            aihf aihfVarCreateBuilder2 = ajtb.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ajtb ajtbVar = (ajtb) aihfVarCreateBuilder2.instance;
            ajsyVar.getClass();
            ajtbVar.c = ajsyVar;
            ajtbVar.b = 91394224;
            aihfVarCreateBuilder.bn(aihfVarCreateBuilder2);
        }
        return Optional.of((ajta) aihfVarCreateBuilder.build());
    }

    public static Optional B(List list) {
        Optional optionalF = F(list);
        return true == optionalF.isPresent() ? ah((aftj) optionalF.get()) : optionalF;
    }

    public static Optional C(List list) {
        Optional optionalF = F(list);
        return true == optionalF.isPresent() ? ai((aftj) optionalF.get()) : optionalF;
    }

    public static Optional D(List list) {
        Optional optionalF = F(list);
        if (true != optionalF.isPresent()) {
            return optionalF;
        }
        aqjg aqjgVar = ((aqjj) ((aftj) optionalF.get()).b).i;
        if (aqjgVar == null) {
            aqjgVar = aqjg.a;
        }
        anvq anvqVar = aqjgVar.e;
        if (anvqVar == null) {
            anvqVar = anvq.a;
        }
        apji apjiVar = anvqVar.f;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajtd.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        Optional optionalOf = Optional.of((ajta) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        optionalOf.isPresent();
        return ajta.a.equals(optionalOf.get()) ? Optional.empty() : optionalOf;
    }

    public static Optional E(List list) {
        Optional optionalF = F(list);
        if (true != optionalF.isPresent()) {
            return optionalF;
        }
        aqjg aqjgVar = ((aqjj) ((aftj) optionalF.get()).b).i;
        if (aqjgVar == null) {
            aqjgVar = aqjg.a;
        }
        anvq anvqVar = aqjgVar.e;
        if (anvqVar == null) {
            anvqVar = anvq.a;
        }
        apji apjiVar = anvqVar.f;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        Optional optionalOf = Optional.of((akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        optionalOf.isPresent();
        return akrn.a.equals(optionalOf.get()) ? Optional.empty() : optionalOf;
    }

    public static Optional F(List list) {
        return Collection.EL.stream(list).filter(new hud(14)).findFirst();
    }

    public static void H(kav kavVar) {
        if (kavVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(kavVar.d) && kavVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(kavVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(kavVar.f) || kavVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public static Intent S(PendingIntent pendingIntent) {
        kro.m(pendingIntent, "The target cannot be null!");
        return new Intent("com.google.android.gms.ui.UNPACKING_REDIRECT").setPackage("com.google.android.gms").setData(Uri.parse("intent://com.google.android.gms.auth.uiflows.common/".concat(String.valueOf(String.valueOf(UUID.randomUUID()))))).putExtra("target", pendingIntent);
    }

    public static boolean T(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static int U(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    public static void V(String str) {
        try {
            try {
                ixt ixtVar = kyi.a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                    httpURLConnection.disconnect();
                    ixt ixtVar2 = kyi.a;
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                ixt ixtVar3 = kyi.a;
            } catch (IndexOutOfBoundsException e2) {
                Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e2.getMessage(), e2);
                ixt ixtVar4 = kyi.a;
            } catch (RuntimeException e3) {
                e = e3;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                ixt ixtVar5 = kyi.a;
            }
        } catch (Throwable th2) {
            ixt ixtVar6 = kyi.a;
            throw th2;
        }
    }

    public static long W(Object obj) {
        if (obj instanceof juu) {
            return ((juu) obj).b;
        }
        return 0L;
    }

    public static Surface X(Object obj) {
        if (obj instanceof Surface) {
            return (Surface) obj;
        }
        if (obj instanceof juu) {
            return ((juu) obj).a;
        }
        return null;
    }

    public static Object Y(Object obj) {
        return obj instanceof juu ? ((juu) obj).a : obj;
    }

    public static boolean Z(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static String a(zwa zwaVar) {
        return "offline_mixtape_removals_tokens_".concat(zwaVar.k());
    }

    public static int aa(int i, int i2, int i3, int i4) {
        int iMin = Math.min(i3, i4) - 2;
        if (i2 == 0 || i2 == -1) {
            i2 = Runtime.getRuntime().availableProcessors();
        } else if (i2 == -2) {
            i2 = Math.max(1, Runtime.getRuntime().availableProcessors() / 2);
        }
        int iMax = Math.max(1, i2);
        if (i <= 0) {
            i = (int) Math.ceil(Math.sqrt(iMax));
        }
        return Math.max(1, Math.min(i, iMin));
    }

    public static /* synthetic */ String ab(int i) {
        if (i != 2) {
            return i != 3 ? "TRUNCATED_AES_PADDING" : "AES_PADDING";
        }
        return "UNKNOWN";
    }

    public static void ac(String str, Throwable th) {
        zvn zvnVar = zvn.b;
        zvm zvmVar = zvm.g;
        if (th == null) {
            th = new Exception();
        }
        zvp.b(zvnVar, zvmVar, str, th);
    }

    public static void ad(xeu xeuVar, String str, Throwable th) {
        if (xeuVar != null) {
            xeuVar.b(yno.cy(th != null ? th : new Exception(), 14, ajtv.ERROR_LEVEL_ERROR, str));
        }
        ac(str, th);
    }

    public static void ae(jsk jskVar, String str) {
        Iterator it = jskVar.g(str).iterator();
        while (it.hasNext()) {
            try {
                jskVar.m((jsp) it.next());
            } catch (jsi unused) {
            }
        }
    }

    public static /* synthetic */ int af(jsq jsqVar, int i) {
        int iHashCode;
        int iHashCode2 = ((jsqVar.a * 31) + jsqVar.b.hashCode()) * 31;
        if (i < 2) {
            long jA = jsqVar.d.a();
            iHashCode = (int) (jA ^ (jA >>> 32));
        } else {
            iHashCode = jsqVar.d.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public static /* synthetic */ jsq ag(int i, DataInputStream dataInputStream) throws IOException {
        jsv jsvVar;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            kyr kyrVar = new kyr();
            kyrVar.q(j);
            jsvVar = jsv.a.b(kyrVar);
        } else {
            int i3 = dataInputStream.readInt();
            HashMap map = new HashMap();
            for (int i4 = 0; i4 < i3; i4++) {
                String utf2 = dataInputStream.readUTF();
                int i5 = dataInputStream.readInt();
                if (i5 < 0) {
                    throw new IOException(a.bR(i5, "Invalid value size: "));
                }
                int iMin = Math.min(i5, 10485760);
                byte[] bArrCopyOf = bwp.e;
                int i6 = 0;
                while (i6 != i5) {
                    int i7 = i6 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                    dataInputStream.readFully(bArrCopyOf, i6, iMin);
                    iMin = Math.min(i5 - i7, 10485760);
                    i6 = i7;
                }
                map.put(utf2, bArrCopyOf);
            }
            jsvVar = new jsv(map);
        }
        return new jsq(i2, utf, jsvVar);
    }

    public static Optional ah(aftj aftjVar) {
        aqjg aqjgVar = ((aqjj) aftjVar.b).i;
        if (aqjgVar == null) {
            aqjgVar = aqjg.a;
        }
        anvq anvqVar = aqjgVar.e;
        if (anvqVar == null) {
            anvqVar = anvq.a;
        }
        if ((anvqVar.b & 2) == 0) {
            return Optional.empty();
        }
        aqjg aqjgVar2 = ((aqjj) aftjVar.b).i;
        if (aqjgVar2 == null) {
            aqjgVar2 = aqjg.a;
        }
        anvq anvqVar2 = aqjgVar2.e;
        if (anvqVar2 == null) {
            anvqVar2 = anvq.a;
        }
        anvl anvlVar = anvqVar2.d;
        if (anvlVar == null) {
            anvlVar = anvl.a;
        }
        return Optional.of(anvlVar);
    }

    public static Optional ai(aftj aftjVar) {
        aqjg aqjgVar = ((aqjj) aftjVar.b).i;
        if (aqjgVar == null) {
            aqjgVar = aqjg.a;
        }
        anvq anvqVar = aqjgVar.e;
        if (anvqVar == null) {
            anvqVar = anvq.a;
        }
        apji apjiVar = anvqVar.e;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anvp.a);
        apjiVar.c(aihlVarCheckIsLite);
        return aext.n(apjiVar.j.n(aihlVarCheckIsLite.d), new gpa(apjiVar, 6));
    }

    public static boolean aj(aftj aftjVar) {
        aqjg aqjgVar = ((aqjj) aftjVar.b).i;
        if (aqjgVar == null) {
            aqjgVar = aqjg.a;
        }
        return (aqjgVar.b & 4194304) != 0;
    }

    public static Set b(SharedPreferences sharedPreferences, zwa zwaVar) {
        Set<String> stringSet = sharedPreferences.getStringSet(a(zwaVar), null);
        return stringSet != null ? new HashSet(stringSet) : new HashSet();
    }

    public static /* synthetic */ int c(Object obj) {
        Objects.checkIndex(0, 3);
        if (obj instanceof anjx) {
            return 0;
        }
        return obj instanceof anuk ? 1 : -2;
    }

    public static aofh d(String str, int i, aohx aohxVar, aofu aofuVar) {
        aihf aihfVarCreateBuilder = anue.a.createBuilder();
        aigj aigjVarV = aigj.v(vzh.b);
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar = (anue) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        anueVar.c |= 1;
        anueVar.f = aigjVarV;
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar2 = (anue) aihfVarCreateBuilder.instance;
        anueVar2.g = aohxVar.l;
        anueVar2.c |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar3 = (anue) aihfVarCreateBuilder.instance;
        anueVar3.c |= 4;
        anueVar3.h = i;
        int i2 = aamn.AUTO_OFFLINE.h;
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar4 = (anue) aihfVarCreateBuilder.instance;
        anueVar4.c |= 8;
        anueVar4.i = i2;
        aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE;
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar5 = (anue) aihfVarCreateBuilder.instance;
        anueVar5.j = aogfVar.e;
        anueVar5.c |= 16;
        if (aofuVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            anue anueVar6 = (anue) aihfVarCreateBuilder.instance;
            anueVar6.n = aofuVar;
            anueVar6.c |= SemanticState.Hidden;
        }
        aihf aihfVarCreateBuilder2 = aofh.a.createBuilder();
        String strAy = kro.ay(str);
        aihfVarCreateBuilder2.copyOnWrite();
        aofh aofhVar = (aofh) aihfVarCreateBuilder2.instance;
        strAy.getClass();
        aofhVar.b |= 2;
        aofhVar.d = strAy;
        aihfVarCreateBuilder2.copyOnWrite();
        aofh aofhVar2 = (aofh) aihfVarCreateBuilder2.instance;
        aofhVar2.c = 1;
        aofhVar2.b |= 1;
        aihh aihhVar = (aihh) aofg.b.createBuilder();
        aihf aihfVarCreateBuilder3 = aofa.a.createBuilder();
        aofb aofbVar = aofb.OFFLINE_MODE_TYPE_AUTO_OFFLINE;
        aihfVarCreateBuilder3.copyOnWrite();
        aofa aofaVar = (aofa) aihfVarCreateBuilder3.instance;
        aofaVar.d = aofbVar.i;
        aofaVar.b |= 4;
        aihf aihfVarCreateBuilder4 = aoez.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        aoez aoezVar = (aoez) aihfVarCreateBuilder4.instance;
        aoezVar.c = 2;
        aoezVar.b |= 1;
        aihfVarCreateBuilder3.copyOnWrite();
        aofa aofaVar2 = (aofa) aihfVarCreateBuilder3.instance;
        aoez aoezVar2 = (aoez) aihfVarCreateBuilder4.build();
        aoezVar2.getClass();
        aofaVar2.e = aoezVar2;
        aofaVar2.b |= 8;
        aofa aofaVar3 = (aofa) aihfVarCreateBuilder3.build();
        aihhVar.copyOnWrite();
        aofg aofgVar = (aofg) aihhVar.instance;
        aofaVar3.getClass();
        aofgVar.g = aofaVar3;
        aofgVar.c |= 2;
        int iK = hmy.k(2, 24, aogfVar);
        aihhVar.copyOnWrite();
        aofg aofgVar2 = (aofg) aihhVar.instance;
        aofgVar2.c |= 1;
        aofgVar2.d = iK;
        aihhVar.e(anue.b, (anue) aihfVarCreateBuilder.build());
        aofg aofgVar3 = (aofg) aihhVar.build();
        aihfVarCreateBuilder2.copyOnWrite();
        aofh aofhVar3 = (aofh) aihfVarCreateBuilder2.instance;
        aofgVar3.getClass();
        aofhVar3.e = aofgVar3;
        aofhVar3.b |= 4;
        return (aofh) aihfVarCreateBuilder2.build();
    }

    public static aofh e(String str, int i, int i2, aofu aofuVar) {
        aihf aihfVarCreateBuilder = anue.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar = (anue) aihfVarCreateBuilder.instance;
        anueVar.c |= 4;
        anueVar.h = i;
        int i3 = aamn.AUTO_OFFLINE.h;
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar2 = (anue) aihfVarCreateBuilder.instance;
        anueVar2.c |= 8;
        anueVar2.i = i3;
        aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE;
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar3 = (anue) aihfVarCreateBuilder.instance;
        anueVar3.j = aogfVar.e;
        anueVar3.c |= 16;
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar4 = (anue) aihfVarCreateBuilder.instance;
        anueVar4.c |= 64;
        anueVar4.l = true;
        aihfVarCreateBuilder.copyOnWrite();
        anue anueVar5 = (anue) aihfVarCreateBuilder.instance;
        anueVar5.c |= SemanticState.Focused;
        anueVar5.m = true;
        if (aofuVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            anue anueVar6 = (anue) aihfVarCreateBuilder.instance;
            anueVar6.n = aofuVar;
            anueVar6.c |= SemanticState.Hidden;
        }
        aihf aihfVarCreateBuilder2 = aofh.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aofh aofhVar = (aofh) aihfVarCreateBuilder2.instance;
        aofhVar.c = 3;
        aofhVar.b |= 1;
        String strAy = kro.ay(str);
        aihfVarCreateBuilder2.copyOnWrite();
        aofh aofhVar2 = (aofh) aihfVarCreateBuilder2.instance;
        strAy.getClass();
        aofhVar2.b |= 2;
        aofhVar2.d = strAy;
        aihh aihhVar = (aihh) aofg.b.createBuilder();
        int iK = hmy.k(4, i2, aogfVar);
        aihhVar.copyOnWrite();
        aofg aofgVar = (aofg) aihhVar.instance;
        aofgVar.c |= 1;
        aofgVar.d = iK;
        aihhVar.e(anue.b, (anue) aihfVarCreateBuilder.build());
        aihfVarCreateBuilder2.copyOnWrite();
        aofh aofhVar3 = (aofh) aihfVarCreateBuilder2.instance;
        aofg aofgVar2 = (aofg) aihhVar.build();
        aofgVar2.getClass();
        aofhVar3.e = aofgVar2;
        aofhVar3.b |= 4;
        return (aofh) aihfVarCreateBuilder2.build();
    }

    public static aofh f(aofu aofuVar, aohx aohxVar) {
        aihf aihfVarCreateBuilder = aofh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
        aofhVar.c = 4;
        aofhVar.b |= 1;
        String strAy = kro.ay("PPSDST");
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
        strAy.getClass();
        aofhVar2.b |= 2;
        aofhVar2.d = strAy;
        aihh aihhVar = (aihh) aofg.b.createBuilder();
        aihhVar.o(aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
        aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE;
        int iK = hmy.k(5, 24, aogfVar);
        aihhVar.copyOnWrite();
        aofg aofgVar = (aofg) aihhVar.instance;
        aofgVar.c |= 1;
        aofgVar.d = iK;
        aihl aihlVar = anue.b;
        aihf aihfVarCreateBuilder2 = anue.a.createBuilder();
        aigj aigjVarV = aigj.v(vzh.b);
        aihfVarCreateBuilder2.copyOnWrite();
        anue anueVar = (anue) aihfVarCreateBuilder2.instance;
        aigjVarV.getClass();
        anueVar.c |= 1;
        anueVar.f = aigjVarV;
        aihfVarCreateBuilder2.copyOnWrite();
        anue anueVar2 = (anue) aihfVarCreateBuilder2.instance;
        anueVar2.g = aohxVar.l;
        anueVar2.c |= 2;
        int i = aamn.AUTO_OFFLINE.h;
        aihfVarCreateBuilder2.copyOnWrite();
        anue anueVar3 = (anue) aihfVarCreateBuilder2.instance;
        anueVar3.c |= 8;
        anueVar3.i = i;
        aihfVarCreateBuilder2.copyOnWrite();
        anue anueVar4 = (anue) aihfVarCreateBuilder2.instance;
        anueVar4.j = aogfVar.e;
        anueVar4.c |= 16;
        aihfVarCreateBuilder2.copyOnWrite();
        anue anueVar5 = (anue) aihfVarCreateBuilder2.instance;
        aofuVar.getClass();
        anueVar5.n = aofuVar;
        anueVar5.c |= SemanticState.Hidden;
        aihhVar.e(aihlVar, (anue) aihfVarCreateBuilder2.build());
        aihf aihfVarCreateBuilder3 = aofa.a.createBuilder();
        aihf aihfVarCreateBuilder4 = aoez.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        aoez aoezVar = (aoez) aihfVarCreateBuilder4.instance;
        aoezVar.c = 3;
        aoezVar.b |= 1;
        aihfVarCreateBuilder3.copyOnWrite();
        aofa aofaVar = (aofa) aihfVarCreateBuilder3.instance;
        aoez aoezVar2 = (aoez) aihfVarCreateBuilder4.build();
        aoezVar2.getClass();
        aofaVar.e = aoezVar2;
        aofaVar.b |= 8;
        aofa aofaVar2 = (aofa) aihfVarCreateBuilder3.build();
        aihhVar.copyOnWrite();
        aofg aofgVar2 = (aofg) aihhVar.instance;
        aofaVar2.getClass();
        aofgVar2.g = aofaVar2;
        aofgVar2.c |= 2;
        aofg aofgVar3 = (aofg) aihhVar.build();
        aihfVarCreateBuilder.copyOnWrite();
        aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
        aofgVar3.getClass();
        aofhVar3.e = aofgVar3;
        aofhVar3.b |= 4;
        return (aofh) aihfVarCreateBuilder.build();
    }

    public static ias g() {
        ias iasVar = new ias();
        iasVar.h(0);
        iasVar.m(0.0f);
        return iasVar;
    }

    public static anvo h(Context context, String str, String str2, ajwo ajwoVar) {
        alay alayVarD;
        aihf aihfVarCreateBuilder = anvo.a.createBuilder();
        alay alayVarD2 = ackj.d(str);
        aihfVarCreateBuilder.copyOnWrite();
        anvo anvoVar = (anvo) aihfVarCreateBuilder.instance;
        alayVarD2.getClass();
        anvoVar.c = alayVarD2;
        anvoVar.b |= 1;
        if (ajwoVar == null) {
            alayVarD = ackj.d(str2);
        } else {
            aihh aihhVar = (aihh) alay.a.createBuilder();
            aihh aihhVar2 = (aihh) alba.a.createBuilder();
            aihhVar2.copyOnWrite();
            alba albaVar = (alba) aihhVar2.instance;
            str2.getClass();
            albaVar.b |= 1;
            albaVar.c = str2;
            aihhVar2.copyOnWrite();
            alba albaVar2 = (alba) aihhVar2.instance;
            albaVar2.l = ajwoVar;
            albaVar2.b |= SemanticState.Modal;
            aihhVar.v(aihhVar2);
            alayVarD = (alay) aihhVar.build();
        }
        aihfVarCreateBuilder.copyOnWrite();
        anvo anvoVar2 = (anvo) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        anvoVar2.d = alayVarD;
        anvoVar2.b |= 2;
        aihh aihhVar3 = (aihh) apji.a.createBuilder();
        aihl aihlVar = ajtd.b;
        aihf aihfVarCreateBuilder2 = ajsy.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ajsy ajsyVar = (ajsy) aihfVarCreateBuilder2.instance;
        ajsyVar.i = 0;
        ajsyVar.b |= 32;
        aihh aihhVar4 = (aihh) ajwo.a.createBuilder();
        aihhVar4.e(apme.a, apmd.a);
        aihfVarCreateBuilder2.copyOnWrite();
        ajsy ajsyVar2 = (ajsy) aihfVarCreateBuilder2.instance;
        ajwo ajwoVar2 = (ajwo) aihhVar4.build();
        ajwoVar2.getClass();
        ajsyVar2.g = ajwoVar2;
        ajsyVar2.b |= 4;
        aihf aihfVarCreateBuilder3 = ajsz.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        ajsz ajszVar = (ajsz) aihfVarCreateBuilder3.instance;
        ajszVar.c = 14;
        ajszVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        ajsy ajsyVar3 = (ajsy) aihfVarCreateBuilder2.instance;
        ajsz ajszVar2 = (ajsz) aihfVarCreateBuilder3.build();
        ajszVar2.getClass();
        ajsyVar3.e = ajszVar2;
        ajsyVar3.b |= 1;
        alay alayVarD3 = ackj.d(context.getString(R.string.queue_header_save_button));
        aihfVarCreateBuilder2.copyOnWrite();
        ajsy ajsyVar4 = (ajsy) aihfVarCreateBuilder2.instance;
        alayVarD3.getClass();
        ajsyVar4.f = alayVarD3;
        ajsyVar4.b |= 2;
        aihh aihhVar5 = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.ADD_TO_PLAYLIST;
        aihhVar5.copyOnWrite();
        alja aljaVar = (alja) aihhVar5.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        ajsy ajsyVar5 = (ajsy) aihfVarCreateBuilder2.instance;
        alja aljaVar2 = (alja) aihhVar5.build();
        aljaVar2.getClass();
        ajsyVar5.d = aljaVar2;
        ajsyVar5.c = 7;
        aihhVar3.e(aihlVar, (ajsy) aihfVarCreateBuilder2.build());
        aihfVarCreateBuilder.copyOnWrite();
        anvo anvoVar3 = (anvo) aihfVarCreateBuilder.instance;
        apji apjiVar = (apji) aihhVar3.build();
        apjiVar.getClass();
        aiie aiieVar = anvoVar3.e;
        if (!aiieVar.c()) {
            anvoVar3.e = aihn.mutableCopy(aiieVar);
        }
        anvoVar3.e.add(apjiVar);
        return (anvo) aihfVarCreateBuilder.build();
    }

    public static apji i(Context context, String str, String str2, ajwo ajwoVar) {
        aihh aihhVar = (aihh) apji.a.createBuilder();
        aihhVar.e(anvp.a, h(context, str, str2, ajwoVar));
        return (apji) aihhVar.build();
    }

    public static Optional j(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aohu.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return Optional.empty();
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aohu.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aoht aohtVar = (aoht) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if ((aohtVar.b & 64) == 0) {
            return Optional.empty();
        }
        aohs aohsVar = aohtVar.h;
        if (aohsVar == null) {
            aohsVar = aohs.a;
        }
        return Optional.of(aohsVar);
    }

    public static String k(Object obj) {
        if (obj instanceof anzi) {
            anzi anziVar = (anzi) obj;
            anst anstVar = anziVar.v;
            if (anstVar == null) {
                anstVar = anst.a;
            }
            if (!(anstVar.b == 1 ? (String) anstVar.c : "").isEmpty()) {
                anst anstVar2 = anziVar.v;
                if (anstVar2 == null) {
                    anstVar2 = anst.a;
                }
                return anstVar2.b == 1 ? (String) anstVar2.c : "";
            }
            if ((anziVar.b & SemanticState.Focused) != 0) {
                ajwo ajwoVar = anziVar.k;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aohu.a);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    ajwo ajwoVar2 = anziVar.k;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aohu.a);
                    ajwoVar2.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                    return ((aoht) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d;
                }
            }
        } else if (obj instanceof anzn) {
            anzn anznVar = (anzn) obj;
            anst anstVar3 = anznVar.q;
            if (anstVar3 == null) {
                anstVar3 = anst.a;
            }
            if (!(anstVar3.b == 1 ? (String) anstVar3.c : "").isEmpty()) {
                anst anstVar4 = anznVar.q;
                if (anstVar4 == null) {
                    anstVar4 = anst.a;
                }
                return anstVar4.b == 1 ? (String) anstVar4.c : "";
            }
            ajwo ajwoVar3 = anznVar.i;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aohu.a);
            ajwoVar3.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVar3.j.k(aihlVarCheckIsLite3.d);
            if ((((aoht) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).b & 2) != 0) {
                ajwo ajwoVar4 = anznVar.i;
                if (ajwoVar4 == null) {
                    ajwoVar4 = ajwo.a;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aohu.a);
                ajwoVar4.c(aihlVarCheckIsLite4);
                Object objK3 = ajwoVar4.j.k(aihlVarCheckIsLite4.d);
                return ((aoht) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3))).d;
            }
        }
        return null;
    }

    public static void l(abvk abvkVar, tbt tbtVar) {
        if (abvkVar.X()) {
            abvkVar.aq(false, 34);
        }
        tbtVar.e(new gse());
    }

    public static /* synthetic */ boolean m(abnl abnlVar) {
        if (abnlVar.J()) {
            ajwo ajwoVar = abnlVar.b;
            Optional optionalEmpty = ajwoVar == null ? Optional.empty() : j(ajwoVar);
            return optionalEmpty.isPresent() && ((aohs) optionalEmpty.get()).e;
        }
        ajwo ajwoVar2 = abnlVar.b;
        if (ajwoVar2 == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arix.a);
        ajwoVar2.c(aihlVarCheckIsLite);
        if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
            return false;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
        ajwoVar2.c(aihlVarCheckIsLite2);
        if (!ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
            return false;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arik.a);
        ajwoVar2.c(aihlVarCheckIsLite3);
        Object objK = ajwoVar2.j.k(aihlVarCheckIsLite3.d);
        arii ariiVar = ((arij) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK))).s;
        if (ariiVar == null) {
            ariiVar = arii.a;
        }
        arih arihVar = ariiVar.c;
        if (arihVar == null) {
            arihVar = arih.a;
        }
        return arihVar.c;
    }

    public static vxe n(Executor executor, vxa vxaVar, CustomThumbnailCreationActivity customThumbnailCreationActivity, xgm xgmVar, Map map) {
        ArrayList arrayList = new ArrayList();
        tzk.T(map, arrayList);
        vwu vwuVar = new vwu(customThumbnailCreationActivity, tzk.S(arrayList, vxaVar), executor);
        agpr agprVar = agpr.a;
        return new xhd(vwuVar, xgmVar, agprVar, agprVar);
    }

    public static vxe o(vxa vxaVar, vxe vxeVar, Map map, xgm xgmVar) {
        ArrayList arrayList = new ArrayList();
        tzk.T(map, arrayList);
        vwr vwrVar = new vwr(tzk.S(arrayList, vxaVar), vxeVar);
        agpr agprVar = agpr.a;
        return new xhd(vwrVar, xgmVar, agprVar, agprVar);
    }

    public static int p(adkz adkzVar, int i, int i2) {
        int iP = 0;
        if (!(adkzVar instanceof adlq)) {
            if (!(adkzVar instanceof admu) || adkzVar.a() <= 0) {
                return 0;
            }
            if ((adkzVar.d(0) instanceof anzi) || (adkzVar.d(0) instanceof iko)) {
                return (i2 - i) + 1;
            }
            return 0;
        }
        adlq adlqVar = (adlq) adkzVar;
        while (i <= i2) {
            adlo adloVarV = adlqVar.v(i);
            if (adloVarV == null) {
                return iP;
            }
            iP += p(adloVarV.a, i - adloVarV.b, adloVarV.f() + (-1) < i2 ? adloVarV.a.a() - 1 : i2 - adloVarV.b);
            i = adloVarV.f();
        }
        return iP;
    }

    public static void q(iis iisVar, Context context, int[] iArr, int i, Bundle bundle) {
        iArr.getClass();
        for (int i2 : iArr) {
            iisVar.a(context, i2, i, bundle);
        }
    }

    public static int r(apzf apzfVar) {
        return aawb.d(apzfVar.f, s(apzfVar));
    }

    public static String s(apzf apzfVar) {
        return (apzfVar.c & 2) != 0 ? apzfVar.e : "";
    }

    public static String t(apzf apzfVar) {
        return (apzfVar.c & 1) != 0 ? apzfVar.d : "";
    }

    public static boolean u(apzf apzfVar, apzf apzfVar2) {
        if (apzfVar == null) {
            if (apzfVar2 == null) {
                return true;
            }
        } else if (apzfVar2 != null && t(apzfVar).equals(t(apzfVar2)) && s(apzfVar).equals(s(apzfVar2)) && r(apzfVar) == r(apzfVar2)) {
            return true;
        }
        return false;
    }

    public static boolean v(wjf wjfVar) {
        wja wjaVarG = wjfVar.g();
        if (wjaVarG == null) {
            return false;
        }
        Iterator it = wjaVarG.r.iterator();
        while (it.hasNext()) {
            if (((wgs) it.next()).af()) {
                return true;
            }
        }
        return false;
    }

    public static boolean w(wjf wjfVar) {
        if (wjfVar == null) {
            return false;
        }
        alvc alvcVar = wjfVar.t().n;
        if (alvcVar == null) {
            alvcVar = alvc.a;
        }
        ajhi ajhiVar = alvcVar.c;
        if (ajhiVar == null) {
            ajhiVar = ajhi.a;
        }
        akxs akxsVarA = akxs.a(ajhiVar.e);
        if (akxsVarA == null) {
            akxsVarA = akxs.FEATURE_AVAILABILITY_UNKNOWN;
        }
        return akxsVarA == akxs.FEATURE_AVAILABILITY_BLOCKED;
    }

    public static boolean x(wjf wjfVar) {
        if (wjfVar == null) {
            return false;
        }
        alvw alvwVar = wjfVar.u().g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        anzw anzwVarA = anzw.a(alvwVar.p);
        if (anzwVarA == null) {
            anzwVarA = anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
        }
        if (!igs.a(anzwVarA)) {
            alvw alvwVar2 = wjfVar.u().g;
            if (alvwVar2 == null) {
                alvwVar2 = alvw.a;
            }
            if (!alvwVar2.q) {
                return false;
            }
        }
        return true;
    }

    public static boolean y(wjf wjfVar) {
        alvw alvwVar = wjfVar.u().g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        anzw anzwVarA = anzw.a(alvwVar.p);
        if (anzwVarA == null) {
            anzwVarA = anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
        }
        return igs.c(anzwVarA);
    }

    public static igc z(igd igdVar) {
        String strW = igdVar.a().w();
        strW.getClass();
        return new igc(igdVar.b, strW);
    }

    public void G() {
        throw null;
    }

    public void I() {
        throw null;
    }

    public void J(int i) {
        throw null;
    }

    public void K(int i) {
        throw null;
    }

    public void L(int i) {
        throw null;
    }

    public hna(char[] cArr) {
    }

    public void P() {
    }

    public void R() {
    }

    public void M(int i) {
    }

    public void N(int i) {
    }

    public void O(jzt jztVar) {
    }

    public void Q(int i) {
    }
}
