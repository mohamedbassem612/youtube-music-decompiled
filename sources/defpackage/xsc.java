package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.gms.cast.CastDevice;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import internal.org.jni_zero.JniZero;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.GZIPOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xsc {
    public static xsc d;
    private static xsc e;
    public final Object a;
    public final Object b;
    public final Object c;

    public xsc(Context context) {
        new adly();
        new HashSet();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.c = layoutInflaterFrom;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.live_chat_poll_creation_sheet, (ViewGroup) null);
        this.a = viewInflate;
        this.b = viewInflate.findViewById(R.id.poll_creation_sheet_content);
    }

    public static String C(String str) {
        return wfs.g(ajfw.b.a(), str);
    }

    public static final void H(wby wbyVar, String str, ajfu ajfuVar, String str2, String str3, List list, ajwo ajwoVar, ajga ajgaVar) {
        ajft ajftVarE;
        if (ajfuVar == null) {
            str.getClass();
            ahno.P(!str.isEmpty(), "key cannot be empty");
            aihf aihfVarCreateBuilder = ajfw.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ajfw ajfwVar = (ajfw) aihfVarCreateBuilder.instance;
            ajfwVar.c |= 1;
            ajfwVar.d = str;
            ajftVarE = new ajft(aihfVarCreateBuilder);
        } else {
            ajftVarE = ajfuVar.d();
            aihf aihfVar = ajftVarE.a;
            aihfVar.copyOnWrite();
            ajfw ajfwVar2 = (ajfw) aihfVar.instance;
            ajfw ajfwVar3 = ajfw.a;
            ajfwVar2.h = ajfw.emptyProtobufList();
        }
        aihf aihfVar2 = ajftVarE.a;
        aihfVar2.copyOnWrite();
        ajfw ajfwVar4 = (ajfw) aihfVar2.instance;
        ajfwVar4.f = ajgaVar.e;
        ajfwVar4.c |= 4;
        aihfVar2.copyOnWrite();
        ajfw ajfwVar5 = (ajfw) aihfVar2.instance;
        str2.getClass();
        ajfwVar5.c |= 2;
        ajfwVar5.e = str2;
        aihf aihfVarCreateBuilder2 = ajfv.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ajfv ajfvVar = (ajfv) aihfVarCreateBuilder2.instance;
        str2.getClass();
        ajfvVar.b |= 1;
        ajfvVar.c = str2;
        aihfVarCreateBuilder2.copyOnWrite();
        ajfv ajfvVar2 = (ajfv) aihfVarCreateBuilder2.instance;
        str3.getClass();
        ajfvVar2.b |= 2;
        ajfvVar2.d = str3;
        aihfVarCreateBuilder2.copyOnWrite();
        ajfv ajfvVar3 = (ajfv) aihfVarCreateBuilder2.instance;
        ajwoVar.getClass();
        ajfvVar3.e = ajwoVar;
        ajfvVar3.b |= 8;
        aihfVarCreateBuilder2.copyOnWrite();
        ajfv ajfvVar4 = (ajfv) aihfVarCreateBuilder2.instance;
        aiie aiieVar = ajfvVar4.f;
        if (!aiieVar.c()) {
            ajfvVar4.f = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list, ajfvVar4.f);
        ajfv ajfvVar5 = (ajfv) aihfVarCreateBuilder2.build();
        aihfVar2.copyOnWrite();
        ajfw ajfwVar6 = (ajfw) aihfVar2.instance;
        ajfvVar5.getClass();
        aiie aiieVar2 = ajfwVar6.h;
        if (!aiieVar2.c()) {
            ajfwVar6.h = aihn.mutableCopy(aiieVar2);
        }
        ajfwVar6.h.add(ajfvVar5);
        al(ajftVarE, wbyVar);
    }

    public static apxf J(apji apjiVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apxg.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            zvp.a(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]Renderer missing ShortsToolbeltButtonRenderer.");
            return apxf.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apxg.a);
        apjiVar.c(aihlVarCheckIsLite2);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
        apxf apxfVar = (apxf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        int i = apxfVar.b;
        if ((i & 1) == 0) {
            zvp.a(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]Renderer missing ToolbeltButtonType.");
            return apxf.a;
        }
        if ((i & 2) == 0) {
            zvp.a(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]Renderer missing ButtonRenderer.");
            return apxf.a;
        }
        arft arftVarA = arft.a(apxfVar.c);
        if (arftVarA == null) {
            arftVarA = arft.TOOLBELT_BUTTON_TYPE_UNSPECIFIED;
        }
        if (arftVarA != arft.TOOLBELT_BUTTON_TYPE_UNSPECIFIED) {
            return apxfVar;
        }
        zvp.a(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]Unspecified ToolbeltButtonType button renderer received.");
        return apxfVar;
    }

    public static auak O(Size size, double d2, Point point, Optional optional) {
        aihf aihfVarCreateBuilder = auak.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        auak auakVar = (auak) aihfVarCreateBuilder.instance;
        auakVar.e = 7;
        auakVar.b |= 4;
        urh urhVar = new urh(aihfVarCreateBuilder, 1);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = urhVar.a;
            akgw akgwVar = (akgw) obj;
            if ((akgwVar.b & 2) != 0) {
                aihf aihfVarCreateBuilder2 = aual.a.createBuilder();
                akgu akguVar = akgwVar.d;
                if (akguVar == null) {
                    akguVar = akgu.a;
                }
                if ((akguVar.b & 2) != 0) {
                    akgu akguVar2 = akgwVar.d;
                    if (akguVar2 == null) {
                        akguVar2 = akgu.a;
                    }
                    int i = akguVar2.d;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aual aualVar = (aual) aihfVarCreateBuilder2.instance;
                    aualVar.b |= 1;
                    aualVar.c = i;
                }
                akgu akguVar3 = akgwVar.d;
                if (((akguVar3 == null ? akgu.a : akguVar3).b & 1) != 0) {
                    if (akguVar3 == null) {
                        akguVar3 = akgu.a;
                    }
                    float f = akguVar3.c;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aual aualVar2 = (aual) aihfVarCreateBuilder2.instance;
                    aualVar2.b |= 2;
                    aualVar2.d = f;
                }
                aihf aihfVar = (aihf) obj2;
                aihfVar.copyOnWrite();
                auak auakVar2 = (auak) aihfVar.instance;
                aual aualVar3 = (aual) aihfVarCreateBuilder2.build();
                aualVar3.getClass();
                auakVar2.h = aualVar3;
                auakVar2.b |= 32;
            }
        }
        int width = size.getWidth();
        int height = size.getHeight();
        if (((-90.0d) + d2) % 180.0d != 0.0d) {
            double dTan = Math.tan(Math.toRadians(d2));
            int iRound = point.y - ((int) Math.round(((double) point.x) * dTan));
            auam auamVarAR = aR(iRound, dTan, width, height, 0);
            aihfVarCreateBuilder.copyOnWrite();
            auak auakVar3 = (auak) aihfVarCreateBuilder.instance;
            auamVarAR.getClass();
            auakVar3.c = auamVarAR;
            auakVar3.b |= 1;
            auam auamVarAR2 = aR(iRound, dTan, width, height, width);
            aihfVarCreateBuilder.copyOnWrite();
            auak auakVar4 = (auak) aihfVarCreateBuilder.instance;
            auamVarAR2.getClass();
            auakVar4.d = auamVarAR2;
            auakVar4.b |= 2;
            return (auak) aihfVarCreateBuilder.build();
        }
        auam auamVar = auam.a;
        aihf aihfVarCreateBuilder3 = auamVar.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        auam auamVar2 = (auam) aihfVarCreateBuilder3.instance;
        auamVar2.b |= 1;
        float f2 = point.x / width;
        auamVar2.c = f2;
        aihfVarCreateBuilder3.copyOnWrite();
        auam auamVar3 = (auam) aihfVarCreateBuilder3.instance;
        auamVar3.b |= 2;
        auamVar3.d = 0.0f;
        aihfVarCreateBuilder.copyOnWrite();
        auak auakVar5 = (auak) aihfVarCreateBuilder.instance;
        auam auamVar4 = (auam) aihfVarCreateBuilder3.build();
        auamVar4.getClass();
        auakVar5.c = auamVar4;
        auakVar5.b |= 1;
        aihf aihfVarCreateBuilder4 = auamVar.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        auam auamVar5 = (auam) aihfVarCreateBuilder4.instance;
        auamVar5.b |= 1;
        auamVar5.c = f2;
        aihfVarCreateBuilder4.copyOnWrite();
        auam auamVar6 = (auam) aihfVarCreateBuilder4.instance;
        auamVar6.b |= 2;
        auamVar6.d = 1.0f;
        aihfVarCreateBuilder.copyOnWrite();
        auak auakVar6 = (auak) aihfVarCreateBuilder.instance;
        auam auamVar7 = (auam) aihfVarCreateBuilder4.build();
        auamVar7.getClass();
        auakVar6.d = auamVar7;
        auakVar6.b |= 2;
        return (auak) aihfVarCreateBuilder.build();
    }

    public static Optional P(double d2, int i, int i2) {
        if (i == 0) {
            return Optional.empty();
        }
        double dRound = Math.round(d2 / ((double) i)) * ((long) i);
        return Math.abs(dRound - d2) <= ((double) i2) ? Optional.of(Double.valueOf(dRound)) : Optional.empty();
    }

    public static boolean Q(auak auakVar, auak auakVar2) {
        int iBg = a.bg(auakVar.e);
        if (iBg == 0) {
            iBg = 1;
        }
        int iBg2 = a.bg(auakVar2.e);
        if (iBg2 == 0) {
            iBg2 = 1;
        }
        if (iBg == iBg2) {
            auam auamVar = auakVar.c;
            if (auamVar == null) {
                auamVar = auam.a;
            }
            float f = auamVar.c;
            auam auamVar2 = auakVar2.c;
            if (f == (auamVar2 == null ? auam.a : auamVar2).c) {
                auam auamVar3 = auakVar.c;
                if (auamVar3 == null) {
                    auamVar3 = auam.a;
                }
                float f2 = auamVar3.d;
                if (auamVar2 == null) {
                    auamVar2 = auam.a;
                }
                if (f2 == auamVar2.d) {
                    auam auamVar4 = auakVar.d;
                    float f3 = (auamVar4 == null ? auam.a : auamVar4).c;
                    auam auamVar5 = auakVar2.d;
                    if (f3 == (auamVar5 == null ? auam.a : auamVar5).c) {
                        if (auamVar4 == null) {
                            auamVar4 = auam.a;
                        }
                        float f4 = auamVar4.d;
                        if (auamVar5 == null) {
                            auamVar5 = auam.a;
                        }
                        if (f4 == auamVar5.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void aF(fnp fnpVar, fnp fnpVar2, String str) {
        if (!fnpVar.b.remove(fnpVar2)) {
            throw new RuntimeException("Tried to remove non-existent input!");
        }
        Map map = fnpVar2.a;
        if (map == null || map.remove(str) == null) {
            throw new RuntimeException("Tried to remove non-existent input with name: ".concat(String.valueOf(str)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    private final boolean aL(jrf jrfVar) {
        return this.c.contains(aO(jrfVar));
    }

    private static final jrf aM(argn argnVar) {
        try {
            return (jrf) aihn.parseFrom(jrf.a, argnVar.c, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
            return jrf.a;
        }
    }

    private static final xhe aN(argn argnVar) {
        return new xhe(argnVar.d, argnVar.f);
    }

    private static final String aO(jrf jrfVar) {
        jre jreVar = jrfVar.d;
        if (jreVar == null) {
            jreVar = jre.a;
        }
        Long lValueOf = Long.valueOf(jreVar.b);
        jre jreVar2 = jrfVar.d;
        if (jreVar2 == null) {
            jreVar2 = jre.a;
        }
        Integer numValueOf = Integer.valueOf(jreVar2.c);
        jre jreVar3 = jrfVar.d;
        if (jreVar3 == null) {
            jreVar3 = jre.a;
        }
        return Integer.toString(Objects.hash(lValueOf, numValueOf, Integer.valueOf(jreVar3.d)));
    }

    private static final boolean aP(argn argnVar) {
        return argnVar.c.d() > 0;
    }

    private final void aQ(String str, argn argnVar) {
        e(str);
        xhf.l((xhc) this.b);
        xhf.i(argnVar);
    }

    private static auam aR(int i, double d2, int i2, int i3, int i4) {
        float f = (float) (((((double) i4) * d2) + ((double) i)) / ((double) i3));
        if (d2 != 0.0d && f < 0.0f) {
            double d3 = d2 * ((double) i2);
            aihf aihfVarCreateBuilder = auam.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            auam auamVar = (auam) aihfVarCreateBuilder.instance;
            auamVar.b |= 1;
            auamVar.c = (float) (((double) (-i)) / d3);
            aihfVarCreateBuilder.copyOnWrite();
            auam auamVar2 = (auam) aihfVarCreateBuilder.instance;
            auamVar2.b |= 2;
            auamVar2.d = 0.0f;
            return (auam) aihfVarCreateBuilder.build();
        }
        if (d2 == 0.0d || f <= 1.0f) {
            float f2 = i2;
            aihf aihfVarCreateBuilder2 = auam.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            auam auamVar3 = (auam) aihfVarCreateBuilder2.instance;
            auamVar3.b |= 1;
            auamVar3.c = i4 / f2;
            aihfVarCreateBuilder2.copyOnWrite();
            auam auamVar4 = (auam) aihfVarCreateBuilder2.instance;
            auamVar4.b |= 2;
            auamVar4.d = f;
            return (auam) aihfVarCreateBuilder2.build();
        }
        double d4 = d2 * ((double) i2);
        int i5 = i3 - i;
        aihf aihfVarCreateBuilder3 = auam.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        auam auamVar5 = (auam) aihfVarCreateBuilder3.instance;
        auamVar5.b |= 1;
        auamVar5.c = (float) (((double) i5) / d4);
        aihfVarCreateBuilder3.copyOnWrite();
        auam auamVar6 = (auam) aihfVarCreateBuilder3.instance;
        auamVar6.b |= 2;
        auamVar6.d = 1.0f;
        return (auam) aihfVarCreateBuilder3.build();
    }

    @Deprecated
    private static final Optional aS(int i, float f, int i2, int i3, int i4) {
        int i5 = ((int) (i2 * f)) - i;
        return Math.abs(i5) <= i3 ? Optional.of(new uqn(uqo.b(null, i4, 0.0f, true, f), i5)) : Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aeez, java.lang.Object] */
    private final void aT(int i) {
        Object obj = this.b;
        ?? r2 = this.a;
        aefb aefbVarA = r2.a();
        aefbVarA.k(((Context) obj).getString(i));
        aefbVarA.i(-1);
        aefbVarA.j();
        r2.d(aefbVarA.b());
    }

    private final synchronized String aU(Enum r3, Map map, String str) {
        int iIntValue;
        iIntValue = ((Integer) j$.util.Map.EL.getOrDefault(map, r3, 0)).intValue();
        map.put(r3, Integer.valueOf(iIntValue + 1));
        return str + r3.name() + '_' + iIntValue;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    private final kdf aV(kyr kyrVar) {
        String str = ((CastDevice) kyrVar.b).a;
        ?? r3 = this.a;
        kdf kdfVar = (kdf) r3.get(str);
        if (kdfVar != null) {
            return kdfVar;
        }
        r3.remove(str);
        kdf kdfVar2 = new kdf();
        kdfVar2.l = kyrVar;
        kdfVar2.k.add(1);
        r3.put(str, kdfVar2);
        return kdfVar2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0268  */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    private final void aW(kyr kyrVar, int i, boolean z, boolean z2) {
        kdf kdfVarAV = aV(kyrVar);
        if (kdfVarAV.g == -1 && !z && !z2) {
            kdfVarAV.k.add(2);
        }
        kdfVarAV.h = System.currentTimeMillis();
        kdfVarAV.i = i;
        kdfVarAV.d = z;
        kdfVarAV.e = z2;
        kdf kdfVar = (kdf) this.a.remove(((CastDevice) kyrVar.b).a);
        if (kdfVar != null) {
            aihf aihfVarCreateBuilder = agzp.a.createBuilder();
            aihf aihfVarCreateBuilder2 = agzn.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            agzn agznVar = (agzn) aihfVarCreateBuilder2.instance;
            agznVar.b |= 2;
            agznVar.d = "23.0.0";
            Object obj = this.c;
            aihfVarCreateBuilder2.copyOnWrite();
            agzn agznVar2 = (agzn) aihfVarCreateBuilder2.instance;
            obj.getClass();
            agznVar2.b |= 1;
            agznVar2.c = (String) obj;
            aihfVarCreateBuilder.am((agzn) aihfVarCreateBuilder2.build());
            CastDevice castDevice = (CastDevice) kdfVar.l.b;
            String str = castDevice.j;
            if (str != null) {
                aihfVarCreateBuilder.copyOnWrite();
                agzp agzpVar = (agzp) aihfVarCreateBuilder.instance;
                agzpVar.b |= 262144;
                agzpVar.i = str;
            }
            aihf aihfVarCreateBuilder3 = agzy.a.createBuilder();
            String str2 = castDevice.e;
            if (!TextUtils.isEmpty(str2)) {
                aihfVarCreateBuilder.copyOnWrite();
                agzp agzpVar2 = (agzp) aihfVarCreateBuilder.instance;
                agzpVar2.b |= SemanticState.Modal;
                agzpVar2.e = str2;
                aihfVarCreateBuilder3.copyOnWrite();
                agzy agzyVar = (agzy) aihfVarCreateBuilder3.instance;
                agzyVar.b |= 1;
                agzyVar.c = str2;
            }
            khd khdVarD = castDevice.d();
            if (khdVarD != null) {
                String str3 = khdVarD.d;
                if (!TextUtils.isEmpty(str3)) {
                    aihfVarCreateBuilder3.copyOnWrite();
                    agzy agzyVar2 = (agzy) aihfVarCreateBuilder3.instance;
                    str3.getClass();
                    agzyVar2.b |= 2;
                    agzyVar2.d = str3;
                }
                String str4 = khdVarD.e;
                if (!TextUtils.isEmpty(str4)) {
                    aihfVarCreateBuilder3.copyOnWrite();
                    agzy agzyVar3 = (agzy) aihfVarCreateBuilder3.instance;
                    str4.getClass();
                    agzyVar3.b |= 4;
                    agzyVar3.e = str4;
                }
                String str5 = khdVarD.f;
                if (!TextUtils.isEmpty(str5)) {
                    aihfVarCreateBuilder3.copyOnWrite();
                    agzy agzyVar4 = (agzy) aihfVarCreateBuilder3.instance;
                    str5.getClass();
                    agzyVar4.b |= 8;
                    agzyVar4.f = str5;
                }
                String str6 = khdVarD.g;
                if (!TextUtils.isEmpty(str6)) {
                    aihfVarCreateBuilder3.copyOnWrite();
                    agzy agzyVar5 = (agzy) aihfVarCreateBuilder3.instance;
                    str6.getClass();
                    agzyVar5.b |= 16;
                    agzyVar5.g = str6;
                }
                String str7 = khdVarD.h;
                if (!TextUtils.isEmpty(str7)) {
                    aihfVarCreateBuilder3.copyOnWrite();
                    agzy agzyVar6 = (agzy) aihfVarCreateBuilder3.instance;
                    str7.getClass();
                    agzyVar6.b |= 32;
                    agzyVar6.h = str7;
                }
                boolean z3 = khdVarD.j;
                aihfVarCreateBuilder3.copyOnWrite();
                agzy agzyVar7 = (agzy) aihfVarCreateBuilder3.instance;
                agzyVar7.b |= SemanticState.Hidden;
                agzyVar7.j = z3;
            }
            int iP = ket.p(castDevice.b());
            aihfVarCreateBuilder3.copyOnWrite();
            agzy agzyVar8 = (agzy) aihfVarCreateBuilder3.instance;
            agzyVar8.i = iP - 1;
            agzyVar8.b |= SemanticState.Focused;
            agzy agzyVar9 = (agzy) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder.copyOnWrite();
            agzp agzpVar3 = (agzp) aihfVarCreateBuilder.instance;
            agzyVar9.getClass();
            agzpVar3.p = agzyVar9;
            agzpVar3.c |= 67108864;
            aihf aihfVarCreateBuilder4 = agzz.a.createBuilder();
            Object obj2 = kdfVar.l.a;
            aihf aihfVarCreateBuilder5 = agzw.a.createBuilder();
            aihfVarCreateBuilder5.copyOnWrite();
            agzw agzwVar = (agzw) aihfVarCreateBuilder5.instance;
            agzwVar.b |= 1;
            agzwVar.c = (String) obj2;
            agzw agzwVar2 = (agzw) aihfVarCreateBuilder5.build();
            String str8 = kdfVar.a;
            aihfVarCreateBuilder4.copyOnWrite();
            agzz agzzVar = (agzz) aihfVarCreateBuilder4.instance;
            str8.getClass();
            agzzVar.b |= 1;
            agzzVar.c = str8;
            aihfVarCreateBuilder4.copyOnWrite();
            agzz agzzVar2 = (agzz) aihfVarCreateBuilder4.instance;
            agzwVar2.getClass();
            agzzVar2.d = agzwVar2;
            agzzVar2.b |= 2;
            boolean z4 = kdfVar.b;
            aihfVarCreateBuilder4.copyOnWrite();
            agzz agzzVar3 = (agzz) aihfVarCreateBuilder4.instance;
            agzzVar3.b |= 4;
            agzzVar3.e = z4;
            boolean z5 = kdfVar.c;
            aihfVarCreateBuilder4.copyOnWrite();
            agzz agzzVar4 = (agzz) aihfVarCreateBuilder4.instance;
            agzzVar4.b |= 8;
            agzzVar4.f = z5;
            boolean z6 = kdfVar.d;
            aihfVarCreateBuilder4.copyOnWrite();
            agzz agzzVar5 = (agzz) aihfVarCreateBuilder4.instance;
            agzzVar5.b |= 16;
            agzzVar5.g = z6;
            boolean z7 = kdfVar.e;
            aihfVarCreateBuilder4.copyOnWrite();
            agzz agzzVar6 = (agzz) aihfVarCreateBuilder4.instance;
            agzzVar6.b |= 32;
            agzzVar6.h = z7;
            int i2 = kdfVar.i;
            aihfVarCreateBuilder4.copyOnWrite();
            agzz agzzVar7 = (agzz) aihfVarCreateBuilder4.instance;
            agzzVar7.b |= SemanticState.Hidden;
            agzzVar7.k = i2;
            int i3 = kdfVar.j;
            aihfVarCreateBuilder4.copyOnWrite();
            agzz agzzVar8 = (agzz) aihfVarCreateBuilder4.instance;
            agzzVar8.b |= SemanticState.LiveRegion;
            agzzVar8.l = i3;
            long j = kdfVar.f;
            if (j != -1) {
                long j2 = kdfVar.g;
                if (j2 != -1) {
                    aihfVarCreateBuilder4.copyOnWrite();
                    agzz agzzVar9 = (agzz) aihfVarCreateBuilder4.instance;
                    agzzVar9.b |= 64;
                    agzzVar9.i = j2 - j;
                    long j3 = kdfVar.h;
                    if (j3 != -1) {
                        long j4 = j3 - kdfVar.g;
                        aihfVarCreateBuilder4.copyOnWrite();
                        agzz agzzVar10 = (agzz) aihfVarCreateBuilder4.instance;
                        agzzVar10.b |= SemanticState.Focused;
                        agzzVar10.j = j4;
                    }
                } else {
                    aihfVarCreateBuilder4.copyOnWrite();
                    agzz agzzVar11 = (agzz) aihfVarCreateBuilder4.instance;
                    agzzVar11.b |= 64;
                    agzzVar11.i = -1L;
                    aihfVarCreateBuilder4.copyOnWrite();
                    agzz agzzVar12 = (agzz) aihfVarCreateBuilder4.instance;
                    agzzVar12.b |= SemanticState.Focused;
                    agzzVar12.j = -1L;
                }
            } else {
                aihfVarCreateBuilder4.copyOnWrite();
                agzz agzzVar13 = (agzz) aihfVarCreateBuilder4.instance;
                agzzVar13.b |= 64;
                agzzVar13.i = -1L;
                aihfVarCreateBuilder4.copyOnWrite();
                agzz agzzVar14 = (agzz) aihfVarCreateBuilder4.instance;
                agzzVar14.b |= SemanticState.Focused;
                agzzVar14.j = -1L;
            }
            List list = kdfVar.k;
            aihfVarCreateBuilder4.copyOnWrite();
            agzz agzzVar15 = (agzz) aihfVarCreateBuilder4.instance;
            aihv aihvVar = agzzVar15.m;
            if (!aihvVar.c()) {
                agzzVar15.m = aihn.mutableCopy(aihvVar);
            }
            aifs.addAll(list, agzzVar15.m);
            agzz agzzVar16 = (agzz) aihfVarCreateBuilder4.build();
            aihfVarCreateBuilder.copyOnWrite();
            agzp agzpVar4 = (agzp) aihfVarCreateBuilder.instance;
            agzzVar16.getClass();
            agzpVar4.o = agzzVar16;
            agzpVar4.c |= 33554432;
            ((kcw) this.b).a((agzp) aihfVarCreateBuilder.build(), 342);
        }
    }

    public static agkz af(Context context) {
        try {
            String[] list = context.getResources().getAssets().list("");
            return list == null ? agpr.a : agkz.o(list);
        } catch (IOException unused) {
            return agpr.a;
        }
    }

    public static final ListenableFuture ak() {
        return ahng.n(Boolean.TRUE);
    }

    public static final void al(tzk tzkVar, wby wbyVar) {
        wer werVarE = wbyVar.e();
        werVarE.m(tzkVar);
        werVarE.b();
    }

    public static synchronized void an(kcw kcwVar, String str) {
        if (e == null) {
            e = new xsc(kcwVar, str);
        }
    }

    public static synchronized void ar(kyr kyrVar, int i) {
        xsc xscVar;
        if (!kcw.a || (xscVar = e) == null) {
            return;
        }
        xscVar.aW(kyrVar, i, true, false);
    }

    public static synchronized void as(kyr kyrVar, int i) {
        xsc xscVar;
        if (!kcw.a || (xscVar = e) == null) {
            return;
        }
        xscVar.aW(kyrVar, i, false, true);
    }

    public static synchronized void at(kyr kyrVar) {
        xsc xscVar;
        if (!kcw.a || (xscVar = e) == null) {
            return;
        }
        xscVar.aV(kyrVar).g = System.currentTimeMillis();
    }

    public static synchronized void au(kyr kyrVar) {
        xsc xscVar;
        if (!kcw.a || (xscVar = e) == null) {
            return;
        }
        kdf kdfVarAV = xscVar.aV(kyrVar);
        if (kdfVarAV.g == -1) {
            kdfVarAV.k.add(3);
        }
        kdfVarAV.j++;
    }

    public static synchronized void av(kyr kyrVar, int i) {
        xsc xscVar;
        if (!kcw.a || (xscVar = e) == null) {
            return;
        }
        xscVar.aW(kyrVar, i, false, false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public static void aw(kyr kyrVar, boolean z) {
        xsc xscVar;
        if (!kcw.a || (xscVar = e) == null) {
            return;
        }
        String str = ((CastDevice) kyrVar.b).a;
        ?? r0 = xscVar.a;
        r0.remove(str);
        kdf kdfVar = new kdf();
        kdfVar.l = kyrVar;
        kdfVar.b = z;
        kdfVar.c = true;
        kdfVar.f = System.currentTimeMillis();
        r0.put(str, kdfVar);
    }

    public static String e(String str) {
        return String.format("INTERACTIONLOGGINGBUG->%s_MISSING_ATTACH", str);
    }

    public static xsc s(vot votVar, boolean z) {
        xsc xscVar = new xsc(votVar);
        xscVar.o(votVar, z);
        return xscVar;
    }

    public static Rect v(zdk zdkVar) {
        return new Rect(zdkVar.c(), zdkVar.d(), zdkVar.c() + zdkVar.b(), zdkVar.d() + zdkVar.a());
    }

    public static final void y(zwv zwvVar) {
        try {
            zwvVar.a();
        } catch (Exception e2) {
            twu.d("NetEventNotifierImpl", 6, "Listener threw exception", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.security.Key] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.security.Key] */
    public final yro A(byte[] bArr) throws Throwable {
        aigj aigjVar = aigj.d;
        aigi aigiVar = new aigi(bArr.length);
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(aigiVar);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.finish();
                    byte[] bArrG = aigiVar.b().G();
                    afxw.h(aigiVar);
                    afxw.h(gZIPOutputStream2);
                    try {
                        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
                        cipher.init(1, (Key) this.b);
                        Mac mac = Mac.getInstance("HmacSHA256");
                        mac.init(this.a);
                        byte[] iv = cipher.getIV();
                        byte[] bArrDoFinal = cipher.doFinal(bArrG);
                        mac.update(bArrDoFinal);
                        return new yro(aigj.v(bArrDoFinal), aigj.v(mac.doFinal(iv)), aigj.v(iv), aigj.v((byte[]) this.c));
                    } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                        throw new yrp(e2);
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new yrp(e);
                } catch (IllegalArgumentException e4) {
                    e = e4;
                    throw new yrp(e);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    afxw.h(aigiVar);
                    afxw.h(gZIPOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        } catch (IllegalArgumentException e6) {
            e = e6;
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yob] */
    public final yny B(wjf wjfVar, long j, long j2, ynz ynzVar) {
        if (wjfVar.g() == null || wjfVar.g().B() || j2 <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        try {
            yod yodVarB = this.a.b(wjfVar.g(), wjfVar.f(), wjfVar.f().aR(), null, Alert.DURATION_SHOW_INDEFINITELY);
            wgs[] wgsVarArr = yodVarB.c;
            if (wgsVarArr.length > 0 && !wgsVarArr[0].W()) {
                arrayList.add(wgsVarArr[0]);
            }
            wgs wgsVar = yodVarB.d;
            if (wgsVar != null && !wgsVar.W()) {
                arrayList.add(wgsVar);
            }
        } catch (yof unused) {
        }
        if (arrayList.isEmpty()) {
            ynzVar.g();
            return null;
        }
        ahno.F(!arrayList.isEmpty());
        yny ynyVar = new yny((abqq) this.b, wjfVar, arrayList, j, j2, ynzVar);
        this.c.execute(ynyVar.h);
        return ynyVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, wbz] */
    public final void D(String str) {
        wby wbyVarB = this.c.e(this.a.e());
        wbyVarB.g(str).g(ajfu.class).k(new mnt(wbyVarB, str, 4)).H();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwb] */
    public final void E(final String str, final String str2, final String str3, ajfz ajfzVar, final List list) {
        final wby wbyVarB = this.c.e(this.a.e());
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(ajfz.b, ajfzVar);
        final ajwo ajwoVar = (ajwo) aihhVar.build();
        int i = 0;
        wbyVarB.g(str).g(ajfu.class).j(new avni() { // from class: vau
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zvl] */
            @Override // defpackage.avni
            public final void a(Object obj) {
                Throwable th = (Throwable) obj;
                yno.fQ(this.g.b, "Error retrieving AssetItemCurrentlySelectedEntityModel, error = ".concat(String.valueOf(th.getLocalizedMessage())), th);
                xsc.H(wbyVarB, str, null, str2, str3, list, ajwoVar, ajga.ASSET_ITEM_SELECTED_STATE_SELECTED);
            }
        }).i(new vav(wbyVarB, str, str2, str3, list, ajwoVar, i)).k(new vaw(wbyVarB, str, str2, str3, list, ajwoVar, i)).H();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, wbz] */
    public final void F(String str, String str2) {
        wby wbyVarB = this.c.e(this.a.e());
        wbyVarB.g(str).g(ajfu.class).k(new gto(str2, wbyVarB, str, 14, (short[]) null)).H();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wbz] */
    public final avlr G(String str) {
        return this.c.e(this.a.e()).j(str, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final agbt I() {
        ?? Io = this.a.io();
        Io.getClass();
        mbc mbcVar = (mbc) this.b.io();
        mbcVar.getClass();
        Executor executor = (Executor) this.c.io();
        executor.getClass();
        return new agbt((aunn) Io, mbcVar, executor);
    }

    public final avlr K() {
        return ((avlr) this.a).O((avmb) this.b).K(new uxe(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, zvl] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, zvl] */
    public final void L(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            ?? r6 = this.c;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 23;
            zvjVarA.d("[ShortsCreation][Android][GetShortsCreation]Command does not have a ShowEngagementPanelEndpoint extension.");
            r6.a(zvjVarA.a());
            return;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apxs.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apxs apxsVar = (apxs) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if ((apxsVar.c & 1) != 0) {
            String strAb = tzk.ab(apxsVar);
            if (strAb == null) {
                ?? r7 = this.c;
                zvj zvjVarA2 = zvk.a();
                zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA2.j = 23;
                zvjVarA2.d("[ShortsCreation][Android][GetShortsCreation]Failed to get panel id from ShowEngagementPanelEndpoint.");
                r7.a(zvjVarA2.a());
                return;
            }
            apxr apxrVar = apxsVar.f;
            if (apxrVar == null) {
                apxrVar = apxr.a;
            }
            wrv wrvVar = (wrv) this.b;
            wrw wrwVarA = wrvVar.a();
            wrwVarA.F(strAb);
            if ((apxrVar.b & 2) != 0) {
                wrwVarA.G(apxrVar.d);
            }
            wrwVarA.A = 2;
            wrwVarA.h = true;
            wrwVarA.o(yno.F(ajwoVar));
            wrvVar.c(wrwVarA, this.a);
        }
    }

    public final float M(double d2) {
        return (float) ujt.a((Size) this.b, d2);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0148  */
    /* JADX WARN: Code duplicated, block: B:48:0x014c  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0165  */
    /* JADX WARN: Code duplicated, block: B:56:0x0169  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01be  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:76:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0214  */
    /* JADX WARN: Code duplicated, block: B:80:0x021a  */
    /* JADX WARN: Code duplicated, block: B:82:0x024d  */
    public final url N(uqp uqpVar, Rect rect, boolean z, boolean z2) {
        Optional optionalEmpty;
        Optional optionalEmpty2;
        boolean z3;
        int i;
        agke agkeVarG;
        agke agkeVarG2;
        Optional optionalEmpty3;
        Optional optional;
        Optional optionalEmpty4;
        Optional optional2;
        agjz agjzVar;
        Optional optionalC;
        urh urhVar;
        boolean z4;
        agke agkeVarG3;
        Optional optionalC2;
        urh urhVar2;
        Optional optionalC3;
        urh urhVar3;
        akgv akgvVar;
        akgv akgvVar2;
        akgx akgxVar = uqpVar.a;
        if ((akgxVar.b & 1) != 0) {
            akgv akgvVar3 = akgxVar.c;
            if (akgvVar3 == null) {
                akgvVar3 = akgv.a;
            }
            optionalEmpty = Optional.of(Float.valueOf(akgvVar3.c));
        } else {
            optionalEmpty = Optional.empty();
        }
        Optional optional3 = optionalEmpty;
        if ((akgxVar.b & 2) != 0) {
            akgv akgvVar4 = akgxVar.d;
            if (akgvVar4 == null) {
                akgvVar4 = akgv.a;
            }
            optionalEmpty2 = Optional.of(Float.valueOf(akgvVar4.c));
        } else {
            optionalEmpty2 = Optional.empty();
        }
        Optional optional4 = optionalEmpty2;
        int i2 = uqpVar.c;
        int i3 = uqpVar.b;
        agjz agjzVar2 = new agjz(4);
        int iCenterX = rect.centerX();
        Size size = (Size) this.b;
        int width = size.getWidth();
        Integer numValueOf = Integer.valueOf(-i2);
        Integer numValueOf2 = Integer.valueOf(i3 + i2);
        Optional optionalC4 = uqo.c(uqpVar, iCenterX, 0.5f, width, i3, new Range(numValueOf, numValueOf2), 3, rect, z);
        urh urhVar4 = new urh(agjzVar2, 0);
        if (true == optionalC4.isPresent()) {
            ((agjz) urhVar4.a).h(optionalC4.get());
        }
        if (optionalC4.isPresent()) {
            if (z2) {
                z3 = true;
            } else {
                agkeVarG2 = agjzVar2.g();
                i = 0;
            }
            if ((akgxVar.b & 4) != 0) {
                akgvVar2 = akgxVar.e;
                if (akgvVar2 == null) {
                    akgvVar2 = akgv.a;
                }
                optionalEmpty3 = Optional.of(Float.valueOf(akgvVar2.c));
            } else {
                optionalEmpty3 = Optional.empty();
            }
            optional = optionalEmpty3;
            if ((akgxVar.b & 8) != 0) {
                akgvVar = akgxVar.f;
                if (akgvVar == null) {
                    akgvVar = akgv.a;
                }
                optionalEmpty4 = Optional.of(Float.valueOf(akgvVar.c));
            } else {
                optionalEmpty4 = Optional.empty();
            }
            optional2 = optionalEmpty4;
            agjzVar = new agjz(4);
            optionalC = uqo.c(uqpVar, rect.centerY(), 0.5f, size.getHeight(), i3, Range.create(numValueOf, numValueOf2), 2, rect, z);
            urhVar = new urh(agjzVar, i);
            if (true == optionalC.isPresent()) {
                ((agjz) urhVar.a).h(optionalC.get());
            }
            if (optionalC.isPresent()) {
                if (z2) {
                    z4 = true;
                } else {
                    agkeVarG3 = agjzVar.g();
                }
                zak zakVar = new zak();
                zakVar.f(agkeVarG2);
                zakVar.g(agkeVarG3);
                return zakVar.e();
            }
            z4 = z2;
            if (optional.isPresent()) {
                optionalC3 = uqo.c(uqpVar, rect.top, ((Float) optional.get()).floatValue(), size.getHeight(), i3, Range.create(numValueOf, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY)), 4, rect, z);
                urhVar3 = new urh(agjzVar, i);
                if (true == optionalC3.isPresent()) {
                    ((agjz) urhVar3.a).h(optionalC3.get());
                }
                if (optionalC3.isPresent() || z4) {
                    if (optional2.isPresent()) {
                        optionalC2 = uqo.c(uqpVar, rect.bottom, 1.0f - ((Float) optional2.get()).floatValue(), size.getHeight(), i3, Range.create(Integer.MIN_VALUE, Integer.valueOf(i2)), 5, rect, z);
                        urhVar2 = new urh(agjzVar, i);
                        if (true == optionalC2.isPresent()) {
                            ((agjz) urhVar2.a).h(optionalC2.get());
                        }
                    }
                    agkeVarG3 = agjzVar.g();
                } else {
                    agkeVarG3 = agjzVar.g();
                }
            } else {
                if (optional2.isPresent()) {
                    optionalC2 = uqo.c(uqpVar, rect.bottom, 1.0f - ((Float) optional2.get()).floatValue(), size.getHeight(), i3, Range.create(Integer.MIN_VALUE, Integer.valueOf(i2)), 5, rect, z);
                    urhVar2 = new urh(agjzVar, i);
                    if (true == optionalC2.isPresent()) {
                        ((agjz) urhVar2.a).h(optionalC2.get());
                    }
                }
                agkeVarG3 = agjzVar.g();
            }
            zak zakVar2 = new zak();
            zakVar2.f(agkeVarG2);
            zakVar2.g(agkeVarG3);
            return zakVar2.e();
        }
        z3 = z2;
        if (optional3.isPresent()) {
            i = 0;
            Optional optionalC5 = uqo.c(uqpVar, rect.left, ((Float) optional3.get()).floatValue(), size.getWidth(), i3, Range.create(numValueOf, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY)), 6, rect, z);
            urh urhVar5 = new urh(agjzVar2, i);
            if (true == optionalC5.isPresent()) {
                ((agjz) urhVar5.a).h(optionalC5.get());
            }
            if (optionalC5.isPresent() && !z3) {
                agkeVarG = agjzVar2.g();
            }
            agkeVarG2 = agkeVarG;
            if ((akgxVar.b & 4) != 0) {
                akgvVar2 = akgxVar.e;
                if (akgvVar2 == null) {
                    akgvVar2 = akgv.a;
                }
                optionalEmpty3 = Optional.of(Float.valueOf(akgvVar2.c));
            } else {
                optionalEmpty3 = Optional.empty();
            }
            optional = optionalEmpty3;
            if ((akgxVar.b & 8) != 0) {
                akgvVar = akgxVar.f;
                if (akgvVar == null) {
                    akgvVar = akgv.a;
                }
                optionalEmpty4 = Optional.of(Float.valueOf(akgvVar.c));
            } else {
                optionalEmpty4 = Optional.empty();
            }
            optional2 = optionalEmpty4;
            agjzVar = new agjz(4);
            optionalC = uqo.c(uqpVar, rect.centerY(), 0.5f, size.getHeight(), i3, Range.create(numValueOf, numValueOf2), 2, rect, z);
            urhVar = new urh(agjzVar, i);
            if (true == optionalC.isPresent()) {
                ((agjz) urhVar.a).h(optionalC.get());
            }
            if (optionalC.isPresent()) {
                if (z2) {
                    agkeVarG3 = agjzVar.g();
                } else {
                    z4 = true;
                }
                zak zakVar3 = new zak();
                zakVar3.f(agkeVarG2);
                zakVar3.g(agkeVarG3);
                return zakVar3.e();
            }
            z4 = z2;
            if (optional.isPresent()) {
                optionalC3 = uqo.c(uqpVar, rect.top, ((Float) optional.get()).floatValue(), size.getHeight(), i3, Range.create(numValueOf, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY)), 4, rect, z);
                urhVar3 = new urh(agjzVar, i);
                if (true == optionalC3.isPresent()) {
                    ((agjz) urhVar3.a).h(optionalC3.get());
                }
                if (optionalC3.isPresent()) {
                    if (optional2.isPresent()) {
                        optionalC2 = uqo.c(uqpVar, rect.bottom, 1.0f - ((Float) optional2.get()).floatValue(), size.getHeight(), i3, Range.create(Integer.MIN_VALUE, Integer.valueOf(i2)), 5, rect, z);
                        urhVar2 = new urh(agjzVar, i);
                        if (true == optionalC2.isPresent()) {
                            ((agjz) urhVar2.a).h(optionalC2.get());
                        }
                    }
                    agkeVarG3 = agjzVar.g();
                } else {
                    if (optional2.isPresent()) {
                        optionalC2 = uqo.c(uqpVar, rect.bottom, 1.0f - ((Float) optional2.get()).floatValue(), size.getHeight(), i3, Range.create(Integer.MIN_VALUE, Integer.valueOf(i2)), 5, rect, z);
                        urhVar2 = new urh(agjzVar, i);
                        if (true == optionalC2.isPresent()) {
                            ((agjz) urhVar2.a).h(optionalC2.get());
                        }
                    }
                    agkeVarG3 = agjzVar.g();
                }
            } else {
                if (optional2.isPresent()) {
                    optionalC2 = uqo.c(uqpVar, rect.bottom, 1.0f - ((Float) optional2.get()).floatValue(), size.getHeight(), i3, Range.create(Integer.MIN_VALUE, Integer.valueOf(i2)), 5, rect, z);
                    urhVar2 = new urh(agjzVar, i);
                    if (true == optionalC2.isPresent()) {
                        ((agjz) urhVar2.a).h(optionalC2.get());
                    }
                }
                agkeVarG3 = agjzVar.g();
            }
            zak zakVar4 = new zak();
            zakVar4.f(agkeVarG2);
            zakVar4.g(agkeVarG3);
            return zakVar4.e();
        }
        i = 0;
        if (optional4.isPresent()) {
            Optional optionalC6 = uqo.c(uqpVar, rect.right, 1.0f - ((Float) optional4.get()).floatValue(), size.getWidth(), i3, Range.create(Integer.MIN_VALUE, Integer.valueOf(i2)), 7, rect, z);
            urh urhVar6 = new urh(agjzVar2, i);
            if (true == optionalC6.isPresent()) {
                ((agjz) urhVar6.a).h(optionalC6.get());
            }
        }
        agkeVarG = agjzVar2.g();
        agkeVarG2 = agkeVarG;
        if ((akgxVar.b & 4) != 0) {
            akgvVar2 = akgxVar.e;
            if (akgvVar2 == null) {
                akgvVar2 = akgv.a;
            }
            optionalEmpty3 = Optional.of(Float.valueOf(akgvVar2.c));
        } else {
            optionalEmpty3 = Optional.empty();
        }
        optional = optionalEmpty3;
        if ((akgxVar.b & 8) != 0) {
            akgvVar = akgxVar.f;
            if (akgvVar == null) {
                akgvVar = akgv.a;
            }
            optionalEmpty4 = Optional.of(Float.valueOf(akgvVar.c));
        } else {
            optionalEmpty4 = Optional.empty();
        }
        optional2 = optionalEmpty4;
        agjzVar = new agjz(4);
        optionalC = uqo.c(uqpVar, rect.centerY(), 0.5f, size.getHeight(), i3, Range.create(numValueOf, numValueOf2), 2, rect, z);
        urhVar = new urh(agjzVar, i);
        if (true == optionalC.isPresent()) {
            ((agjz) urhVar.a).h(optionalC.get());
        }
        if (optionalC.isPresent()) {
            if (z2) {
                agkeVarG3 = agjzVar.g();
            } else {
                z4 = true;
            }
            zak zakVar5 = new zak();
            zakVar5.f(agkeVarG2);
            zakVar5.g(agkeVarG3);
            return zakVar5.e();
        }
        z4 = z2;
        if (optional.isPresent()) {
            optionalC3 = uqo.c(uqpVar, rect.top, ((Float) optional.get()).floatValue(), size.getHeight(), i3, Range.create(numValueOf, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY)), 4, rect, z);
            urhVar3 = new urh(agjzVar, i);
            if (true == optionalC3.isPresent()) {
                ((agjz) urhVar3.a).h(optionalC3.get());
            }
            if (optionalC3.isPresent()) {
                if (optional2.isPresent()) {
                    optionalC2 = uqo.c(uqpVar, rect.bottom, 1.0f - ((Float) optional2.get()).floatValue(), size.getHeight(), i3, Range.create(Integer.MIN_VALUE, Integer.valueOf(i2)), 5, rect, z);
                    urhVar2 = new urh(agjzVar, i);
                    if (true == optionalC2.isPresent()) {
                        ((agjz) urhVar2.a).h(optionalC2.get());
                    }
                }
                agkeVarG3 = agjzVar.g();
            } else {
                if (optional2.isPresent()) {
                    optionalC2 = uqo.c(uqpVar, rect.bottom, 1.0f - ((Float) optional2.get()).floatValue(), size.getHeight(), i3, Range.create(Integer.MIN_VALUE, Integer.valueOf(i2)), 5, rect, z);
                    urhVar2 = new urh(agjzVar, i);
                    if (true == optionalC2.isPresent()) {
                        ((agjz) urhVar2.a).h(optionalC2.get());
                    }
                }
                agkeVarG3 = agjzVar.g();
            }
        } else {
            if (optional2.isPresent()) {
                optionalC2 = uqo.c(uqpVar, rect.bottom, 1.0f - ((Float) optional2.get()).floatValue(), size.getHeight(), i3, Range.create(Integer.MIN_VALUE, Integer.valueOf(i2)), 5, rect, z);
                urhVar2 = new urh(agjzVar, i);
                if (true == optionalC2.isPresent()) {
                    ((agjz) urhVar2.a).h(optionalC2.get());
                }
            }
            agkeVarG3 = agjzVar.g();
        }
        zak zakVar6 = new zak();
        zakVar6.f(agkeVarG2);
        zakVar6.g(agkeVarG3);
        return zakVar6.e();
    }

    @Deprecated
    public final Optional R(int i, float f, int i2, int i3) {
        return aS(i, f, ((Size) this.b).getHeight(), i2, i3);
    }

    @Deprecated
    public final Optional S(int i, float f, int i2, int i3) {
        return aS(i, f, ((Size) this.b).getWidth(), i2, i3);
    }

    public final agke T(List list, Set set) {
        ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            auew auewVar = (auew) it.next();
            aihf builder = auewVar.toBuilder();
            Object obj = this.a;
            auhs auhsVar = auewVar.c;
            if (auhsVar == null) {
                auhsVar = auhs.a;
            }
            auhs auhsVarF = auhsVar;
            agke agkeVarA = uvn.a(auhsVarF, set);
            if (!agkeVarA.isEmpty()) {
                try {
                    auhsVarF = uvn.f((Context) obj, auhsVarF, agkeVarA);
                } catch (utw e2) {
                    ((agrc) ((agrc) ((agrc) uvn.a.c()).j(e2)).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/proto/PrimaryContentMixins", "sanitizeInvalidMedia", (char) 263, "PrimaryContentMixins.java")).t("Failed to sanitize invalid media in composition");
                }
            }
            builder.copyOnWrite();
            auew auewVar2 = (auew) builder.instance;
            auhsVarF.getClass();
            auewVar2.c = auhsVarF;
            auewVar2.b |= 1;
            arrayList.add((auew) builder.build());
        }
        return aguu.T(arrayList);
    }

    public final auhs U(ula ulaVar, auhs auhsVar, auhs auhsVar2, agke agkeVar) {
        try {
            auhs auhsVarF = uvn.f((Context) this.a, auhsVar, agkeVar);
            auhsVarF.getClass();
            return auhsVarF;
        } catch (utw unused) {
            ulp ulpVar = ulaVar.g;
            ((agrc) ((agrc) ulp.a.b()).k("com/google/android/libraries/youtube/creation/editor/ShortsEditViewModel", "onReplaceInvalidSourcesFailed", 1224, "ShortsEditViewModel.java")).t("Failed on replacing invalid sources for restored composition");
            ulpVar.o();
            return auhsVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aeez, java.lang.Object] */
    public final void V(alna alnaVar, Map map) {
        alay alayVar;
        if (alnaVar != null) {
            if ((alnaVar.b & 32) != 0) {
                ?? r0 = this.c;
                ajwo ajwoVar = alnaVar.d;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                r0.a(ajwoVar);
            }
            alay alayVar2 = alnaVar.c;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar2, null, false);
            if (spannedK == null || spannedK.length() == 0) {
                return;
            }
            ?? r3 = this.a;
            aefb aefbVarA = r3.a();
            aefbVarA.k(spannedK);
            aefbVarA.i(-1);
            aefbVarA.j();
            ajng ajngVar = alnaVar.e;
            if (ajngVar == null) {
                ajngVar = ajng.a;
            }
            if ((ajngVar.b & 1) != 0) {
                ajng ajngVar2 = alnaVar.e;
                if (ajngVar2 == null) {
                    ajngVar2 = ajng.a;
                }
                ajnf ajnfVar = ajngVar2.c;
                if (ajnfVar == null) {
                    ajnfVar = ajnf.a;
                }
                ajnf ajnfVar2 = ajnfVar;
                if ((ajnfVar2.b & 64) != 0) {
                    alayVar = ajnfVar2.m;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                aefbVarA.l(ackj.k(null, alayVar, null, false), new ivx((Object) this, (Object) ajnfVar2, (Object) map, 9, (byte[]) null));
            }
            r3.d(aefbVarA.b());
        }
    }

    public final void W(alna alnaVar, Map map, int i) {
        if (alnaVar == null) {
            aT(i);
            return;
        }
        if ((alnaVar.b & 32) == 0) {
            alay alayVar = alnaVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
            Spanned spannedK = ackj.k(null, alayVar, null, false);
            if (spannedK == null || spannedK.length() == 0) {
                aT(i);
                return;
            }
        }
        V(alnaVar, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final String X(aixg aixgVar, String str) {
        return aU(aixgVar, this.b, String.valueOf(str).concat("_"));
    }

    public final String Y() {
        return ((rnj) this.a).e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized String Z(aixr aixrVar) {
        return aU(aixrVar, this.c, "");
    }

    public final int a() {
        return ((xsb) this.c).d;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xgn] */
    public final Dialog aA(int i, int i2, aaui aauiVar, int i3, int i4, xhc xhcVar) {
        AlertDialog.Builder positiveButton = ((abfv) this.a).g((Context) this.b).setTitle(i).setMessage(i2).setCancelable(true).setPositiveButton(i4, new hrg(this, aauiVar, xhcVar, 0));
        positiveButton.setNegativeButton(i3, (DialogInterface.OnClickListener) null);
        this.c.l(new xgj(xhcVar));
        return positiveButton.create();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    public final void aB(zne zneVar) {
        zneVar.getClass();
        ?? r0 = this.a;
        r0.lock();
        try {
            xir xirVar = (xir) ((ConcurrentHashMap) this.c).remove(zneVar);
            if (xirVar != null) {
                xirVar.f(tau.ACTION_ABANDONED);
            }
        } finally {
            r0.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    public final void aC(zne zneVar, tau tauVar) {
        zneVar.getClass();
        ?? r0 = this.a;
        r0.lock();
        try {
            xir xirVar = (xir) ((ConcurrentHashMap) this.c).get(zneVar);
            if (xirVar != null) {
                xirVar.f(tauVar);
            }
        } finally {
            r0.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aunn, java.lang.Object] */
    public final aeqo aD() {
        aaew aaewVarD = ((aanb) this.c.io()).b().d();
        Object objIo = this.a.io();
        objIo.getClass();
        aary aaryVar = (aary) objIo;
        if (aaewVarD == null) {
            return null;
        }
        Object obj = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append("Client Version: ");
        try {
            sb.append(((Context) obj).getPackageManager().getPackageInfo(((Context) obj).getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            sb.append("NameNotFoundException");
        }
        sb.append('\n');
        aaewVarD.p(sb, "videosV2", aagi.b);
        aaewVarD.p(sb, "playlistsV13", aafi.b);
        aaewVarD.p(sb, "playlist_video", aafh.a);
        aaewVarD.p(sb, "video_listsV13", aagd.b);
        aaewVarD.p(sb, "video_list_videos", aagc.a);
        aaewVarD.p(sb, "streams", aafw.a);
        aaewVarD.p(sb, "ads", aaem.a);
        aaewVarD.p(sb, "channelsV13", aaeo.a);
        aaewVarD.p(sb, "subscriptionsV31", aafx.a);
        String string = sb.toString();
        String strC = aaryVar.c();
        zj zjVar = new zj();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = string.concat(strC).getBytes(charset);
        bytes.getClass();
        zjVar.b = bytes;
        zjVar.d();
        zjVar.a = "offline_db_dump";
        return zjVar.c();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wnf] */
    public final void aE(String str, wlu wluVar, wne wneVar) {
        wluVar.z(2);
        taf.i(zik.ch(this.c, wluVar, wneVar), MoreExecutors.directExecutor(), new glo(4), new gov(str, this, 3, null), null);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final String aG(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            ?? r3 = this.b;
            int size = r3.size();
            ?? r5 = this.a;
            if (i2 >= size) {
                sb.append((String) r5.get(r3.size()));
                return sb.toString();
            }
            sb.append((String) r5.get(i2));
            if (((Integer) r3.get(i2)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) r3.get(i2)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) this.c.get(i2), Long.valueOf(j)));
            } else if (((Integer) r3.get(i2)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) this.c.get(i2), Integer.valueOf(i)));
            } else if (((Integer) r3.get(i2)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) this.c.get(i2), Long.valueOf(j2)));
            }
            i2++;
        }
    }

    public final void aH(are areVar) {
        ArrayList arrayList = (ArrayList) this.a;
        arrayList.clear();
        int size = areVar.aI.size();
        for (int i = 0; i < size; i++) {
            ard ardVar = (ard) areVar.aI.get(i);
            if (ardVar.M() == 3 || ardVar.N() == 3) {
                arrayList.add(ardVar);
            }
        }
        areVar.c();
    }

    public final boolean aI(asc ascVar, ard ardVar, int i) {
        arl arlVar = (arl) this.b;
        arlVar.i = ardVar.M();
        arlVar.j = ardVar.N();
        arlVar.a = ardVar.j();
        arlVar.b = ardVar.h();
        arlVar.g = false;
        arlVar.h = i;
        int i2 = arlVar.i;
        int i3 = arlVar.j;
        boolean z = i2 == 3 && ardVar.X > 0.0f;
        boolean z2 = i3 == 3 && ardVar.X > 0.0f;
        if (z && ardVar.u[0] == 4) {
            arlVar.i = 1;
        }
        if (z2 && ardVar.u[1] == 4) {
            arlVar.j = 1;
        }
        ascVar.a(ardVar, arlVar);
        ardVar.C(arlVar.c);
        ardVar.x(arlVar.d);
        ardVar.F = arlVar.f;
        ardVar.u(arlVar.e);
        arlVar.h = 0;
        return arlVar.g;
    }

    public final void aJ(are areVar, int i, int i2, int i3) {
        int i4 = areVar.ac;
        int i5 = areVar.ad;
        areVar.B(0);
        areVar.A(0);
        areVar.C(i2);
        areVar.x(i3);
        areVar.B(i4);
        areVar.A(i5);
        Object obj = this.c;
        ((are) obj).b = i;
        ((ark) obj).T();
    }

    public final Location aK(String str) {
        try {
            Object obj = this.a;
            if (((LocationManager) obj).isProviderEnabled(str)) {
                return ((LocationManager) obj).getLastKnownLocation(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final synchronized String aa() {
        return ((rnj) this.a).e();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Map] */
    public final void ab(acfw acfwVar, String str) {
        acfx acfxVar;
        acfx acfxVar2 = null;
        if (((abmt) this.a).S()) {
            acfx acfxVar3 = (acfx) this.b.remove(str);
            if (acfxVar3 == null) {
                return;
            }
            acfxVar2 = acfxVar3;
            acfxVar = null;
        } else {
            acfxVar = (acfx) this.c.remove(str);
            if (acfxVar == null) {
                return;
            }
        }
        if (acfwVar == null || acfwVar.g() == null) {
            return;
        }
        if (acfxVar2 != null) {
            acfwVar.g().n(acfxVar2);
        } else if (acfxVar != null) {
            acfwVar.g().n(acfxVar);
        }
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Map] */
    public final void ac(rsp rspVar, acfw acfwVar, long j, long j2, int i, int i2, String str) throws rso {
        if (acfwVar == null) {
            throw new rso("Couldn't schedule cueRange because videoPlayback was null", 65);
        }
        if (acfwVar.g() == null) {
            throw new rso("Couldn't schedule cueRange because registrar was null", 80);
        }
        if (j > j2) {
            throw new rso("Invalid cue range duration", 19);
        }
        if (((abmt) this.a).S()) {
            ruh ruhVar = new ruh(j, j2, i, i2, rspVar, str);
            this.b.put(str, ruhVar);
            acfwVar.g().g(ruhVar);
        } else {
            rui ruiVar = new rui(j, j2, i, i2, rspVar, str);
            this.c.put(str, ruiVar);
            acfwVar.g().g(ruiVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r1v10, types: [acwd, java.lang.Object] */
    public final void ad() {
        ?? r0 = this.c;
        if (r0.e() instanceof rlt) {
            rlt rltVar = (rlt) r0.e();
            if (!rltVar.d()) {
                ((Activity) this.a).startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", rltVar.b), 0);
            } else {
                this.b.a((Context) this.a, Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("hl", Locale.getDefault().getLanguage()).appendQueryParameter("continue", String.format("https://myaccount.google.com/?pageId=%s&utm_source=YouTubeAndroid&utm_medium=act&hl=%s", rltVar.c, Locale.getDefault().getLanguage())).appendQueryParameter("Email", rltVar.b).build());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture ae(ajhs ajhsVar) {
        if (ajhsVar.ordinal() != 1) {
            return null;
        }
        return ahcs.e(((omj) this.b).I(), new rns(this, 0), this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final ListenableFuture ag(qyv qyvVar) {
        if (!((qua) this.c).ae) {
            return ahcs.e(this.a, new onn(qyvVar, 10), MoreExecutors.directExecutor());
        }
        return ((rjb) this.b).d(this.a, new onn(qyvVar, 11));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized bec ah(plx plxVar) {
        Object objE;
        plxVar.getClass();
        long j = plxVar.a;
        ?? r9 = this.c;
        Long lValueOf = Long.valueOf(j);
        objE = r9.get(lValueOf);
        if (objE == null) {
            String strConcat = "".concat(j + "_StoredNotificationsCounts.pb");
            Object obj = this.b;
            File file = new File(((Context) obj).getNoBackupFilesDir(), "notifications_counts_data_store/".concat(strConcat));
            File file2 = new File(((Context) obj).getFilesDir(), "notifications_counts_data_store/shared/".concat(strConcat));
            if (file2.exists()) {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                File file3 = new File(file.getParentFile(), file.getName() + '.' + UUID.randomUUID() + ".tmp");
                try {
                    JniZero.k(file2, file3);
                    if (file3.renameTo(file)) {
                        file2.delete();
                    } else {
                        file3.delete();
                        file2.delete();
                    }
                } catch (Exception unused) {
                    file3.delete();
                    file2.delete();
                }
            }
            pbu pbuVar = pbu.a;
            pbuVar.getClass();
            objE = azt.e(new bgd(pbuVar), null, awno.a, this.a, new pbm(file, 0));
            r9.put(lValueOf, objE);
        }
        return (bec) objE;
    }

    public final ListenableFuture ai(ojx ojxVar) {
        Uri uri = ojxVar.a;
        String lastPathSegment = uri.getLastPathSegment();
        lastPathSegment.getClass();
        try {
            File parentFile = rmp.L(uri, new omj(this.b, (byte[]) null)).getParentFile();
            parentFile.getClass();
            try {
                return ape.f(new usp(this, ojxVar, parentFile, lastPathSegment, (tld) ((ayq) this.a).X(ojxVar.a, new qqp(1)), 1));
            } catch (IOException e2) {
                onb.g(e2, "%s: Unable to create mobstore ResponseWriter for file %s", "OffroadFileDownloader", ojxVar.a);
                acb acbVarA = oig.a();
                acbVarA.b = oif.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                acbVarA.d = e2;
                return ahng.m(acbVarA.a());
            }
        } catch (IOException e3) {
            onb.d("%s: The file uri is malformed, uri = %s", "OffroadFileDownloader", ojxVar.a);
            acb acbVarA2 = oig.a();
            acbVarA2.b = oif.MALFORMED_FILE_URI_ERROR;
            acbVarA2.d = e3;
            return ahng.m(acbVarA2.a());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture aj() {
        ListenableFuture listenableFutureR = ahng.r(new iug(this, 17), this.a);
        ((omj) this.c).m(15302, listenableFutureR);
        return listenableFutureR;
    }

    public final boolean am(byte[] bArr) {
        boolean zA;
        try {
            Object obj = this.b;
            agyo.b((File) obj);
            agyo.d(bArr, (File) obj);
            zA = ((kto) this.a).a((File) obj);
        } catch (IOException | GeneralSecurityException e2) {
            ((omj) this.c).i(2027, e2);
            zA = false;
        }
        try {
            ((File) this.b).delete();
        } catch (SecurityException unused) {
        }
        return zA;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final int ao(String str) {
        Integer num = (Integer) this.a.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void ap(String str, String str2, int i) {
        this.b.put(str, str2);
        this.c.put(str2, str);
        this.a.put(str, Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final jlo aq(cf cfVar) {
        xgm xgmVar = (xgm) this.b.io();
        xgmVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) this.c.io();
        sharedPreferences.getClass();
        jkx jkxVar = (jkx) this.a.io();
        jkxVar.getClass();
        return new jlo(xgmVar, sharedPreferences, jkxVar, cfVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture ax() {
        return ahno.ar(((ayq) this.b.io()).i(), new iii(this, 10), this.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aunn, java.lang.Object] */
    public final void ay(boolean z) {
        afjn.d(27, ((ayq) this.b.io()).j(new iqm(z, 2)), "Failed to update don't play podcast video setting", new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xgm] */
    public final void az(int i, Integer num, aaui aauiVar, int i2, int i3) {
        acwf acwfVarT = acww.t();
        Context context = (Context) this.b;
        acwfVarT.a = context.getString(i);
        if (num != null) {
            acfz.z(acwfVarT, context.getString(num.intValue()));
        }
        acwfVarT.f = new hrh(aauiVar, this, i3);
        ajnf ajnfVar = ajnf.a;
        aihh aihhVar = (aihh) ajnfVar.createBuilder();
        alay alayVarD = ackj.d(context.getString(R.string.cancel));
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        alayVarD.getClass();
        ajnfVar2.m = alayVarD;
        ajnfVar2.b |= 64;
        aihhVar.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
        ajnfVar3.d = 39;
        ajnfVar3.c = 1;
        acwfVarT.d = (ajnf) aihhVar.build();
        aihh aihhVar2 = (aihh) ajnfVar.createBuilder();
        alay alayVarD2 = ackj.d(context.getString(i2));
        aihhVar2.copyOnWrite();
        ajnf ajnfVar4 = (ajnf) aihhVar2.instance;
        alayVarD2.getClass();
        ajnfVar4.m = alayVarD2;
        ajnfVar4.b |= 64;
        aihhVar2.copyOnWrite();
        ajnf ajnfVar5 = (ajnf) aihhVar2.instance;
        ajnfVar5.d = 42;
        ajnfVar5.c = 1;
        acwfVarT.c = (ajnf) aihhVar2.build();
        ((acwq) this.a).f(acwfVarT.a());
        this.c.hB().l(new xgj(xhb.b(i3)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    final void b(String str, Optional optional) {
        d(optional, ((xrj) this.b.io()).b(str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aunn, java.lang.Object] */
    final void c(String str) {
        int iB;
        yco ycoVar = ((ycp) this.c.io()).e;
        String str2 = null;
        if (ycoVar != null && ((iB = ycoVar.b()) == 0 || iB == 1)) {
            str2 = ycoVar.n().c;
        }
        if (!TextUtils.isEmpty(str2) && !xsa.b(str, str2)) {
            agrx agrxVar = agso.a;
            return;
        }
        if (((xrj) this.b.io()).e(str)) {
            b(str, Optional.empty());
            return;
        }
        boolean zJ = ((xsa) this.a.io()).j();
        Optional optionalEmpty = Optional.empty();
        xrh xrhVarA = xri.a();
        xrhVarA.c(true);
        xrhVarA.b(zJ);
        d(optionalEmpty, xrhVarA.a());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aunn, java.lang.Object] */
    final void d(Optional optional, xri xriVar) {
        agrx agrxVar = agso.a;
        boolean z = xriVar.a;
        ((ycp) this.c.io()).h(xriVar, optional);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Set] */
    public final boolean f(argn argnVar) {
        if (aP(argnVar)) {
            jrf jrfVarAM = aM(argnVar);
            if ((jrfVarAM.b & 4) == 0) {
                return false;
            }
            if (aL(jrfVarAM)) {
                xhf.l((xhc) this.b);
                xhf.i(argnVar);
                return false;
            }
            this.c.add(aO(jrfVarAM));
        } else {
            this.a.add(aN(argnVar));
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Set] */
    public final boolean g(argn argnVar, String str) {
        if (aP(argnVar)) {
            jrf jrfVarAM = aM(argnVar);
            if ((jrfVarAM.b & 4) != 0) {
                if (aL(jrfVarAM)) {
                    return true;
                }
                aQ(str, argnVar);
            }
        } else {
            if (this.a.contains(aN(argnVar))) {
                return true;
            }
            aQ(str, argnVar);
        }
        return false;
    }

    public final int h() {
        return ((ArrayDeque) this.c).size();
    }

    public final vot i() {
        vot votVar = (vot) ((ArrayDeque) this.c).peek();
        votVar.getClass();
        return votVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    public final agev j() {
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (arrayDeque.size() <= 1) {
            return agdf.a;
        }
        vot votVar = (vot) arrayDeque.pop();
        this.a.remove(votVar.a);
        votVar.b(4);
        return agev.i(votVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    public final void k() {
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((vot) it.next()).b(5);
        }
        arrayDeque.clear();
        this.a.clear();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    public final void l() {
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((vot) it.next()).b(4);
        }
        arrayDeque.clear();
        this.a.clear();
    }

    public final void m() {
        Iterator it = ((ArrayDeque) this.c).iterator();
        while (it.hasNext()) {
            ((vot) it.next()).b(3);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    public final void n(String str) {
        vot votVar;
        if (!q(str)) {
            return;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        int size = arrayDeque.size();
        while (true) {
            size--;
            if (size <= 0 || (votVar = (vot) arrayDeque.peek()) == null) {
                return;
            }
            String str2 = votVar.a;
            if (str.equals(str2)) {
                return;
            }
            arrayDeque.pop();
            this.a.remove(str2);
            votVar.b(4);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final void o(vot votVar, boolean z) {
        String str = votVar.a;
        if (str != null) {
            if (q(str)) {
                n(str);
                return;
            }
            ((ArrayDeque) this.c).push(votVar);
            this.a.add(str);
            if (z) {
                votVar.b(2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    public final void p(String str) {
        if (q(str)) {
            Iterator it = ((ArrayDeque) this.c).iterator();
            while (it.hasNext()) {
                vot votVar = (vot) it.next();
                if (votVar.a.equals(str)) {
                    it.remove();
                    this.a.remove(str);
                    votVar.b(4);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final boolean q(String str) {
        return this.a.contains(str);
    }

    public final void r() {
        Object obj = this.b;
        if (obj != null) {
            ((View) obj).setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    public final abrl t(zza zzaVar, long j) {
        ahbw ahbwVar = (ahbw) this.a.io();
        ahbwVar.getClass();
        vxz vxzVar = (vxz) this.c.io();
        vxzVar.getClass();
        Set set = (Set) this.b.io();
        set.getClass();
        return new abrl(ahbwVar, vxzVar, set, zzaVar, j);
    }

    public final wjj u(String str) {
        str.getClass();
        return (wjj) ((ConcurrentHashMap) this.c).get(str);
    }

    public final void w(aazt aaztVar) {
        ((awku) this.c).kk(aaztVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmi, java.lang.Object] */
    public final Set x() {
        return (Set) this.c.a();
    }

    public final void z() {
        Object obj = this.b;
        if (obj != null) {
            ((zdr) obj).D();
        }
    }

    public xsc(Context context, LocationManager locationManager) {
        this.c = new gz();
        this.b = context;
        this.a = locationManager;
    }

    public xsc(Context context, Object obj, Object obj2) {
        this.b = context;
        this.c = obj;
        this.a = obj2;
    }

    public xsc(cc ccVar, roq roqVar, Set set) {
        this.b = ccVar;
        this.c = set;
        this.a = roqVar;
    }

    public xsc(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public xsc(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public xsc(Object obj, Object obj2, Object obj3, char[] cArr) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public xsc(Object obj, Object obj2, Object obj3, float[] fArr) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public xsc(Object obj, Object obj2, Object obj3, int[] iArr) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public xsc(Object obj, Object obj2, Object obj3, short[] sArr) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public xsc(Object obj, Object obj2, Object obj3, boolean[] zArr) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public xsc(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
    }

    public xsc(Cipher cipher) {
        this.b = cipher;
        this.a = null;
        this.c = null;
    }

    public xsc(Mac mac) {
        this.c = mac;
        this.b = null;
        this.a = null;
    }

    public xsc(nyc nycVar, fkt fktVar) {
        this.a = "imageprefetch";
        this.c = nycVar;
        this.b = fktVar;
    }

    public xsc(vge vgeVar, Handler handler, xgm xgmVar) {
        this.a = vgeVar;
        this.c = handler;
        this.b = xgmVar;
    }

    public xsc(Activity activity, aeda aedaVar, awmd awmdVar) {
        aedaVar.getClass();
        awmdVar.getClass();
        this.b = activity;
        this.a = aedaVar;
        this.c = awmdVar;
    }

    public xsc(are areVar) {
        this.a = new ArrayList();
        this.b = new arl();
        this.c = areVar;
    }

    public xsc(aunn aunnVar) {
        aunnVar.getClass();
        this.b = aunnVar;
        this.a = new ReentrantLock();
        this.c = new ConcurrentHashMap();
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, char[] cArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, char[] cArr, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        this.b = awmdVar3;
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, short[] sArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
    }

    public xsc(Optional optional, Optional optional2, Size size) {
        ahno.G(size.getHeight() != 0, "Point space height must be non-zero.");
        ahno.G(size.getWidth() != 0, "Point space width must be non-zero.");
        this.a = true == optional.isPresent() ? Optional.ofNullable(uqo.a((uqp) optional.get(), (Size) new sla(size, 17).a)) : optional;
        this.c = optional2;
        this.b = size;
    }

    public xsc(nyc nycVar, fkt fktVar, fiz fizVar) {
        this.a = nycVar;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(fktVar);
        this.b = fizVar;
    }

    private xsc(vot votVar) {
        this.a = new HashSet();
        this.c = new ArrayDeque();
        this.b = votVar;
    }

    public xsc(byte[] bArr, byte[] bArr2) {
        this.b = new ArrayList();
        this.a = new ArrayList();
        this.c = new ArrayList();
    }

    public xsc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new Object();
        this.c = new afv();
        this.b = new afv();
    }

    public xsc(Context context, ahey aheyVar, aaok aaokVar, zvl zvlVar) {
        context.getClass();
        aheyVar.getClass();
        aaokVar.getClass();
        zvlVar.getClass();
        this.a = context;
        this.b = aheyVar;
        this.c = zvlVar;
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = awmdVar;
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, short[] sArr, byte[] bArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
    }

    public xsc(aend aendVar, Executor executor, awut awutVar) {
        executor.getClass();
        awutVar.getClass();
        this.b = aendVar;
        this.a = executor;
        this.c = awutVar;
    }

    public xsc(Context context, gqh gqhVar, Set set) {
        context.getClass();
        gqhVar.getClass();
        set.getClass();
        this.b = context;
        this.c = gqhVar;
        this.a = set;
    }

    public xsc(Context context, xgm xgmVar, abfv abfvVar) {
        context.getClass();
        this.b = context;
        this.c = xgmVar.hB();
        this.a = abfvVar;
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr, char[] cArr, byte[] bArr2) {
        awmdVar.getClass();
        this.c = awmdVar;
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
    }

    public xsc(String str) {
        this.a = str;
        this.b = new fui(this, 9);
        this.c = new HashMap();
    }

    public xsc(View view, uhy uhyVar) {
        this.a = view;
        this.b = view.findViewById(R.id.green_screen_media_item_thumbnail_border);
        View viewFindViewById = view.findViewById(R.id.loading_spinner);
        this.c = uhyVar;
        uhyVar.a = viewFindViewById;
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
    }

    public xsc(vxz vxzVar) {
        this.c = Collections.newSetFromMap(new WeakHashMap());
        this.a = new HashSet();
        this.b = vxzVar;
    }

    public xsc() {
        this.c = new awku();
        this.b = new awlo().az();
        this.a = new awlo().az();
    }

    public xsc(Context context, acwq acwqVar, xgm xgmVar) {
        context.getClass();
        acwqVar.getClass();
        xgmVar.getClass();
        this.b = context;
        this.a = acwqVar;
        this.c = xgmVar;
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, char[] cArr, byte[] bArr) {
        this.b = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, int[] iArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
    }

    public xsc(Context context, aunn aunnVar, aunn aunnVar2) {
        context.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        this.b = context;
        this.c = aunnVar;
        this.a = aunnVar2;
    }

    public xsc(Context context, Executor executor, aaok aaokVar) {
        new ConcurrentHashMap();
        this.b = context;
        this.c = executor;
        this.a = aaokVar;
    }

    public xsc(aaok aaokVar, awut awutVar) {
        awutVar.getClass();
        this.b = aaokVar;
        this.c = awutVar;
        this.a = new ConcurrentHashMap();
    }

    public xsc(avlh avlhVar) {
        avlhVar.getClass();
        this.a = avlhVar;
        this.c = new ConcurrentHashMap();
        avmm avmmVar = new avmm();
        this.b = avmmVar;
        avmmVar.c(avlhVar.al(new abid(new yrc(this, 13), 0), new abid(abie.a, 2)));
    }

    public xsc(avmb avmbVar) {
        this.c = awlu.av(1).az();
        this.a = awlu.av(1).az();
        this.b = avmbVar;
    }

    public xsc(sqr sqrVar) {
        afx afxVar = new afx(0);
        this.a = afxVar;
        afx afxVar2 = new afx(0);
        this.b = afxVar2;
        this.c = sqrVar;
        afxVar2.add(sqrVar);
        afxVar.add(sqrVar);
    }

    public xsc(aihf aihfVar, String str, qvk qvkVar) {
        this.c = aihfVar;
        this.b = str;
        this.a = qvkVar;
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr, char[] cArr) {
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
    }

    public xsc(cf cfVar, Context context, vxz vxzVar) {
        cfVar.getClass();
        context.getClass();
        vxzVar.getClass();
        this.a = cfVar;
        this.c = context;
        this.b = vxzVar;
    }

    public xsc(byte[] bArr) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = new HashMap();
    }

    public xsc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr) {
        this.a = awmdVar;
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
    }

    public xsc(abwk abwkVar, awmd awmdVar, awmd awmdVar2) {
        abwkVar.getClass();
        awmdVar2.getClass();
        this.c = abwkVar;
        this.a = awmdVar;
        this.b = awmdVar2;
    }

    public xsc(aazu aazuVar) {
        awku awkuVar = new awku();
        this.c = awkuVar;
        this.b = aazuVar;
        this.a = awkuVar.R(aazt.a, new abiw(1));
    }

    private xsc(kcw kcwVar, String str) {
        this.b = kcwVar;
        this.c = str;
        this.a = new ConcurrentHashMap();
    }

    public xsc(rrq rrqVar, Context context, awut awutVar) {
        rrqVar.getClass();
        context.getClass();
        this.b = context;
        this.a = awutVar;
        this.c = new LinkedHashMap();
    }

    public xsc(View view) {
        this.a = (TextView) view.findViewById(R.id.list_item_text);
        this.b = (ImageView) view.findViewById(R.id.list_item_icon_primary);
        this.c = (ImageView) view.findViewById(R.id.list_item_icon_secondary);
    }

    public xsc(Context context, rjb rjbVar, qua quaVar) {
        this.b = rjbVar;
        this.c = quaVar;
        if (quaVar.ae) {
            this.a = rjbVar.c(new qoh(context, 4));
        } else {
            this.a = ahng.n(af(context));
        }
    }

    public xsc(agke agkeVar, quc qucVar) {
        this.b = new Object();
        new quc();
        this.a = agkeVar;
        this.c = qucVar;
    }

    public xsc(xhc xhcVar) {
        this.b = xhcVar;
        this.c = new HashSet();
        this.a = new HashSet();
    }

    public xsc(Activity activity, zwb zwbVar, vxz vxzVar) {
        this.c = activity;
        this.a = zwbVar;
        this.b = Optional.of(vxzVar);
    }

    public xsc(Activity activity, zwb zwbVar, acwd acwdVar) {
        activity.getClass();
        this.a = activity;
        this.c = zwbVar;
        this.b = acwdVar;
    }

    public xsc(xzs xzsVar, vxe vxeVar, awut awutVar) {
        vxeVar.getClass();
        awutVar.getClass();
        this.a = xzsVar;
        this.b = vxeVar;
        this.c = awutVar;
    }

    public xsc(Context context, xmj xmjVar) {
        this.a = mda.m(2);
        khn khnVar = kbe.a;
        this.c = new lpo(context);
        this.b = xmjVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public xsc(aunn aunnVar, grj grjVar, rtm rtmVar) {
        this.b = aunnVar;
        wjz wjzVar = (wjz) grjVar.a.io();
        wjzVar.getClass();
        this.c = new abrm(wjzVar);
        this.a = rtmVar;
    }

    public xsc(abmt abmtVar) {
        this.c = new HashMap();
        this.b = new HashMap();
        this.a = abmtVar;
    }

    public xsc(String str, String str2, String str3, xsb xsbVar) {
        str.getClass();
        str2.getClass();
        this.a = str2;
        this.b = str3;
        this.c = xsbVar;
    }

    public xsc(rnj rnjVar) {
        new EnumMap(aixo.class);
        this.b = new EnumMap(aixg.class);
        this.c = new EnumMap(aixr.class);
        this.a = rnjVar;
    }

    public xsc(abqq abqqVar, yob yobVar, Executor executor) {
        abqqVar.getClass();
        this.b = abqqVar;
        yobVar.getClass();
        this.a = yobVar;
        executor.getClass();
        this.c = executor;
    }

    public xsc(xpl xplVar) {
        zkf.c(1 == ((((byte[]) xplVar.b).length & 1) ^ 1));
        byte[] bArr = (byte[]) xplVar.b;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length >> 1);
        byte[] bArr2 = (byte[]) xplVar.b;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, bArr2.length >> 1, 32);
        this.c = xplVar.a;
        this.b = new SecretKeySpec(bArrCopyOf, "AES");
        this.a = new SecretKeySpec(bArrCopyOfRange, "HmacSHA256");
    }

    public xsc(zew zewVar, zcf zcfVar, cno cnoVar) {
        zkf.d(zewVar);
        this.a = zewVar;
        zkf.d(zcfVar);
        this.c = zcfVar;
        zkf.d(cnoVar);
        this.b = cnoVar;
    }

    public xsc(PackageManager packageManager, TelephonyManager telephonyManager, dov dovVar) {
        dovVar.getClass();
        this.b = packageManager;
        this.a = telephonyManager;
        this.c = dovVar;
    }

    public xsc(awmd awmdVar) {
        awmdVar.getClass();
        this.a = awmdVar;
        this.b = new CopyOnWriteArraySet();
        this.c = atqp.k(2, new zqe(this, 7));
    }
}
