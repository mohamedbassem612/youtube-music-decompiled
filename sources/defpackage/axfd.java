package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ImageView;
import androidx.versionedparcelable.ParcelImpl;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.interfaces.CommandHandler;
import com.google.android.libraries.elements.interfaces.CommandHandlerResolver;
import com.google.android.libraries.elements.interfaces.CommandThread;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import defpackage.axfd;
import defpackage.dtp;
import defpackage.dtr;
import defpackage.eo;
import defpackage.eq;
import defpackage.et;
import defpackage.eu;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axfd {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [agfr, java.lang.Object] */
    public axfd(awmd awmdVar, CommandHandler commandHandler, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, agev agevVar, Map map) {
        this.d = awmdVar;
        if (commandHandler != null && ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue()) {
            commandHandler = new mqn(new WeakReference(commandHandler));
        }
        this.a = aguu.al(new jxq(commandHandler, awmdVar2, 3));
        this.c = awmdVar3;
        this.b = awmdVar4;
        this.e = new mqp();
        agqs agqsVarListIterator = ((agke) ((agpn) map).values()).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            Object obj = ((heg) agqsVarListIterator.next()).a;
            if (obj != null) {
                ((CommandHandlerResolver) this.a.io()).registerCommandHandler((CommandHandler) obj, aslc.b.a(), CommandThread.ANY);
            }
        }
    }

    public static vun G(int i, int i2, int i3, vun vunVar) {
        if (i3 >= i / 2) {
            return i3 > (i2 + i) / 2 ? vun.d : vun.c;
        }
        return vunVar;
    }

    public static final agev K(boolean z, agkz agkzVar) {
        if (z) {
            if (agkzVar.contains(akua.ENGAGEMENT_PANEL_SNAP_STATE_WRAP_CONTENT)) {
                return new agfa(vun.e);
            }
            if (agkzVar.size() == 1) {
                if (agkzVar.contains(akua.ENGAGEMENT_PANEL_SNAP_STATE_FULL_BLEED)) {
                    return new agfa(vun.a);
                }
                if (!agkzVar.contains(akua.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER)) {
                    if (agkzVar.contains(akua.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_MINI_PLAYER)) {
                        return new agfa(vun.b);
                    }
                }
            }
            return agdf.a;
        }
        return new agfa(vun.c);
    }

    public static final ofe M(amkq amkqVar, boolean z) {
        ofe ofeVar = new ofe();
        ofeVar.a = amkqVar.c;
        boolean z2 = amkqVar.d;
        boolean z3 = amkqVar.e;
        ofeVar.b = amkqVar.f;
        ofeVar.c = amkqVar.g;
        ofeVar.d = amkqVar.h;
        ofeVar.e = amkqVar.i;
        if (z) {
            ofeVar.f = amkqVar.j;
        }
        return ofeVar;
    }

    public static final Optional N(smr smrVar, sko skoVar) {
        aixg aixgVar = aixg.LAYOUT_TYPE_MEDIA;
        if (skoVar.f(aixgVar, sjb.class) && (skoVar.d(sjb.class) instanceof skz)) {
            return Optional.of(rue.a);
        }
        return (skoVar.f(aixgVar, sjj.class, sjl.class) && smrVar.c() == aixo.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) ? Optional.of(rue.b) : Optional.empty();
    }

    public static /* synthetic */ void R(Throwable th) {
        throw new IllegalStateException("DefaultTikTokBridge: switch account error", th);
    }

    public static qma S(String str, String str2, byte[] bArr) {
        if (str == null || bArr == null) {
            return null;
        }
        byte[][] bArr2 = lle.a;
        return new qma(new lle(str, bArr, bArr2, bArr2, bArr2, bArr2, null, null, null, null), str2);
    }

    public static void T(kis kisVar, agfr agfrVar, agek agekVar) {
        String str;
        int[] iArr;
        int[] iArr2;
        byte[][] bArr;
        byte[][] bArr2;
        byte[] bArr3;
        int[] iArr3;
        int[] iArr4;
        byte[][] bArr4;
        byte[][] bArr5;
        lle lleVar;
        byte[][] bArr6;
        int[] iArr5;
        byte[][] bArr7;
        int[] iArr6;
        ArrayList<lle> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        kic kicVar = (kic) kisVar;
        kicVar.h.isEmpty();
        for (qma qmaVar : (Set) agfrVar.io()) {
            arrayList.add(qmaVar.a);
            hashSet.add(qmaVar.b);
        }
        ArrayList<String> arrayList2 = kicVar.c;
        if (arrayList2 != null) {
            for (String str2 : arrayList2) {
                qma qmaVar2 = (qma) agekVar.apply(str2);
                if (qmaVar2 != null) {
                    arrayList.add(qmaVar2.a);
                    hashSet.add(str2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.isEmpty()) {
            lleVar = lle.b;
        } else {
            final int i = 1;
            final int i2 = 0;
            if (arrayList.size() == 1) {
                lleVar = (lle) arrayList.get(0);
            } else {
                if (arrayList.isEmpty()) {
                    str = ((lle) arrayList.get(0)).c;
                    break;
                }
                String str3 = ((lle) arrayList.get(0)).c;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!a.ae(str3, ((lle) it.next()).c)) {
                            str = "";
                            break;
                        }
                    } else {
                        str = ((lle) arrayList.get(0)).c;
                        break;
                    }
                }
                String str4 = str;
                byte[][] bArrA = lle.a(arrayList, new lld() { // from class: llc
                    @Override // defpackage.lld
                    public final byte[][] a(lle lleVar2) {
                        int i3 = i;
                        if (i3 == 0) {
                            return lleVar2.f;
                        }
                        if (i3 != 1) {
                            return i3 != 2 ? lleVar2.h : lleVar2.g;
                        }
                        return lleVar2.e;
                    }
                });
                byte[][] bArrA2 = lle.a(arrayList, new lld() { // from class: llc
                    @Override // defpackage.lld
                    public final byte[][] a(lle lleVar2) {
                        int i3 = i2;
                        if (i3 == 0) {
                            return lleVar2.f;
                        }
                        if (i3 != 1) {
                            return i3 != 2 ? lleVar2.h : lleVar2.g;
                        }
                        return lleVar2.e;
                    }
                });
                final int i3 = 2;
                byte[][] bArrA3 = lle.a(arrayList, new lld() { // from class: llc
                    @Override // defpackage.lld
                    public final byte[][] a(lle lleVar2) {
                        int i4 = i3;
                        if (i4 == 0) {
                            return lleVar2.f;
                        }
                        if (i4 != 1) {
                            return i4 != 2 ? lleVar2.h : lleVar2.g;
                        }
                        return lleVar2.e;
                    }
                });
                final int i4 = 3;
                byte[][] bArrA4 = lle.a(arrayList, new lld() { // from class: llc
                    @Override // defpackage.lld
                    public final byte[][] a(lle lleVar2) {
                        int i5 = i4;
                        if (i5 == 0) {
                            return lleVar2.f;
                        }
                        if (i5 != 1) {
                            return i5 != 2 ? lleVar2.h : lleVar2.g;
                        }
                        return lleVar2.e;
                    }
                });
                boolean z = true;
                int length = 0;
                for (lle lleVar2 : arrayList) {
                    if (lleVar2 != null && (iArr6 = lleVar2.i) != null) {
                        length += iArr6.length;
                        z = false;
                    }
                }
                if (z) {
                    iArr = null;
                } else {
                    int[] iArr7 = new int[length];
                    int i5 = 0;
                    for (lle lleVar3 : arrayList) {
                        if (lleVar3 != null && (iArr2 = lleVar3.i) != null) {
                            int i6 = 0;
                            while (i6 < iArr2.length) {
                                iArr7[i5] = iArr2[i6];
                                i6++;
                                i5++;
                            }
                        }
                    }
                    iArr = iArr7;
                }
                int length2 = 0;
                boolean z2 = true;
                for (lle lleVar4 : arrayList) {
                    if (lleVar4 != null && lleVar4.d != null) {
                        length2++;
                        z2 = false;
                    }
                    if (lleVar4 != null && (bArr7 = lleVar4.j) != null) {
                        length2 += bArr7.length;
                        z2 = false;
                    }
                }
                if (z2) {
                    bArr = null;
                } else {
                    byte[][] bArr8 = new byte[length2][];
                    int i7 = 0;
                    for (lle lleVar5 : arrayList) {
                        if (lleVar5 != null && (bArr3 = lleVar5.d) != null) {
                            bArr8[i7] = bArr3;
                            i7++;
                        }
                        if (lleVar5 != null && (bArr2 = lleVar5.j) != null) {
                            int i8 = i2;
                            while (i8 < bArr2.length) {
                                bArr8[i7] = bArr2[i8];
                                i8++;
                                i7++;
                            }
                        }
                        i2 = 0;
                    }
                    bArr = bArr8;
                }
                boolean z3 = true;
                int length3 = 0;
                for (lle lleVar6 : arrayList) {
                    if (lleVar6 != null && (iArr5 = lleVar6.k) != null) {
                        length3 += iArr5.length;
                        z3 = false;
                    }
                }
                if (z3) {
                    iArr3 = null;
                } else {
                    int[] iArr8 = new int[length3];
                    int i9 = 0;
                    for (lle lleVar7 : arrayList) {
                        if (lleVar7 != null && (iArr4 = lleVar7.k) != null) {
                            int i10 = 0;
                            while (i10 < iArr4.length) {
                                iArr8[i9] = iArr4[i10];
                                i10++;
                                i9++;
                            }
                        }
                        arrayList = arrayList;
                    }
                    iArr3 = iArr8;
                }
                ArrayList<lle> arrayList3 = arrayList;
                int length4 = 0;
                boolean z4 = true;
                for (lle lleVar8 : arrayList3) {
                    if (lleVar8 != null && (bArr6 = lleVar8.l) != null) {
                        length4 += bArr6.length;
                        z4 = false;
                    }
                }
                if (z4) {
                    bArr4 = null;
                } else {
                    byte[][] bArr9 = new byte[length4][];
                    int i11 = 0;
                    for (Iterator it2 = arrayList3.iterator(); it2.hasNext(); it2 = it2) {
                        lle lleVar9 = (lle) it2.next();
                        if (lleVar9 != null && (bArr5 = lleVar9.l) != null) {
                            for (byte[] bArr10 : bArr5) {
                                if (bArr10 != null) {
                                    bArr9[i11] = bArr10;
                                    i11++;
                                }
                            }
                        }
                    }
                    bArr4 = bArr9;
                }
                lleVar = new lle(str4, null, bArrA, bArrA2, bArrA3, bArrA4, iArr, bArr, iArr3, bArr4);
            }
        }
        kib kibVar = kicVar.a;
        if (kibVar.d()) {
            throw new IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
        }
        if (kicVar.f == null) {
            kicVar.f = new HashSet();
        }
        kicVar.f.addAll(hashSet);
        if (kibVar.d()) {
            throw new IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
        }
        if (lleVar != null) {
            if (kicVar.e == null) {
                kicVar.e = new ArrayList();
            }
            kicVar.e.add(lleVar);
        }
    }

    public static final agkz U(String str, AtomicReference atomicReference) {
        if (str == null || atomicReference == null) {
            return agpr.a;
        }
        agkx agkxVar = new agkx();
        Object obj = atomicReference.get();
        if (obj instanceof qmb) {
            int i = qmb.b;
            ((qmb) obj).a(str, agkxVar);
        } else {
            for (qmb qmbVar : (qmb[]) obj) {
                int i2 = qmb.b;
                qmbVar.a(str, agkxVar);
            }
        }
        return agkxVar.g();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    private final void aA(String str, MessageLite messageLite) {
        this.d.edit().putString(str, Base64.encodeToString(messageLite.toByteArray(), 0)).commit();
    }

    public static void ac(jsv jsvVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = jsvVar.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static void az(Activity activity, fg fgVar) {
        activity.setMediaController(new MediaController(activity, (MediaSession.Token) ((MediaSessionCompat$Token) fgVar.c).b));
    }

    public static final Exception h(lpa lpaVar) {
        return lpaVar.e() != null ? lpaVar.e() : new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    public static wuq m(tbt tbtVar, wup wupVar, String str, String str2, String str3, int i, String str4, byte[] bArr, Optional optional, Optional optional2, Optional optional3, xir xirVar) {
        abqs abqsVar = new abqs(tbtVar, xirVar);
        wuq wuqVarA = wupVar.a(str);
        wuqVarA.G(str2);
        wuqVarA.a = i;
        wuqVarA.b = str3;
        wuqVarA.F(str4);
        wuqVarA.o(bArr);
        wuqVarA.x = abqsVar;
        wuqVarA.M = optional;
        wuqVarA.N = optional2;
        if (optional3.isPresent()) {
            ((abnh) optional3.get()).a.isPresent();
            ((abnh) optional3.get()).b.isPresent();
            if (((abnh) optional3.get()).c.isPresent()) {
                wuqVarA.H = (amac) ((abnh) optional3.get()).c.get();
            }
            Optional optional4 = ((abnh) optional3.get()).d;
            yyk yykVar = new yyk(wuqVarA, 19);
            if (true == optional4.isPresent()) {
                Object obj = optional4.get();
                Object obj2 = yykVar.a;
                ((Boolean) obj).booleanValue();
                ((wuq) obj2).O = Optional.of(Boolean.TRUE);
            }
        }
        return wuqVarA;
    }

    public static ContentValues u(aaok aaokVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", (String) aaokVar.b);
        contentValues.put("offline_channel_data_proto", ((aifs) aaokVar.a).toByteArray());
        return contentValues;
    }

    public final tgf A(Collection collection) {
        tge tgeVarB = tgf.b(String.valueOf(B()).concat("get_screen_availability"));
        tgeVarB.d = tgd.d(Collections.singletonMap("lounge_token", TextUtils.join(",", collection)), tfs.a);
        if (((vxz) this.c).m(14, 45627566L)) {
            tgeVarB.d(tok.MDX_PAIRING_URL_BUILDER_SCREEN_AVAILABILITY_WITH_LOUNGE_TOKENS);
        }
        return tgeVarB.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final String B() {
        return ((ydy) this.b.io()).g;
    }

    public final asbq C(Map map, Long l) {
        aihh aihhVar = (aihh) asbq.a.createBuilder();
        vxz vxzVar = (vxz) this.a;
        boolean zL = vxzVar.l(13, 45428544L, false);
        aihhVar.copyOnWrite();
        asbq asbqVar = (asbq) aihhVar.instance;
        asbqVar.b |= 1;
        asbqVar.c = zL;
        boolean zL2 = vxzVar.l(16, 45430213L, false);
        aihhVar.copyOnWrite();
        asbq asbqVar2 = (asbq) aihhVar.instance;
        asbqVar2.b |= 4;
        asbqVar2.e = zL2;
        boolean zL3 = vxzVar.l(24, 45712556L, false);
        aihhVar.copyOnWrite();
        asbq asbqVar3 = (asbq) aihhVar.instance;
        asbqVar3.b |= 8;
        asbqVar3.f = zL3;
        aihl aihlVar = asbx.b;
        aihh aihhVar2 = (aihh) asbx.a.createBuilder();
        boolean zL4 = vxzVar.l(5, 45399471L, false);
        aihhVar2.copyOnWrite();
        asbx asbxVar = (asbx) aihhVar2.instance;
        asbxVar.c |= 1;
        asbxVar.d = zL4;
        boolean zL5 = vxzVar.l(2, 45370239L, false);
        aihhVar2.copyOnWrite();
        asbx asbxVar2 = (asbx) aihhVar2.instance;
        asbxVar2.c |= 2;
        asbxVar2.e = zL5;
        long jC = vxzVar.c(0, 45370410L, 0L);
        aihhVar2.copyOnWrite();
        asbx asbxVar3 = (asbx) aihhVar2.instance;
        asbxVar3.c |= 4;
        asbxVar3.f = jC;
        aihhVar.e(aihlVar, (asbx) aihhVar2.build());
        aihl aihlVar2 = asbu.b;
        aihf aihfVarCreateBuilder = asbu.a.createBuilder();
        aihf aihfVarCreateBuilder2 = asbt.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        asbt asbtVar = (asbt) aihfVarCreateBuilder2.instance;
        asbtVar.c = 2;
        asbtVar.b |= 1;
        String strN = vxzVar.n(0, 45401853L);
        aihfVarCreateBuilder2.copyOnWrite();
        asbt asbtVar2 = (asbt) aihfVarCreateBuilder2.instance;
        strN.getClass();
        asbtVar2.b |= 2;
        asbtVar2.d = strN;
        boolean zL6 = vxzVar.l(12, 45427956L, false);
        aihfVarCreateBuilder2.copyOnWrite();
        asbt asbtVar3 = (asbt) aihfVarCreateBuilder2.instance;
        asbtVar3.b |= 8;
        asbtVar3.e = zL6;
        long jC2 = vxzVar.c(4, 45429070L, 0L);
        aihfVarCreateBuilder2.copyOnWrite();
        asbt asbtVar4 = (asbt) aihfVarCreateBuilder2.instance;
        asbtVar4.b |= 16;
        asbtVar4.f = jC2;
        boolean zL7 = vxzVar.l(22, 45670892L, false);
        aihfVarCreateBuilder2.copyOnWrite();
        asbt asbtVar5 = (asbt) aihfVarCreateBuilder2.instance;
        asbtVar5.b |= 32;
        asbtVar5.g = zL7;
        boolean zL8 = vxzVar.l(26, 45730301L, false);
        aihfVarCreateBuilder2.copyOnWrite();
        asbt asbtVar6 = (asbt) aihfVarCreateBuilder2.instance;
        asbtVar6.b |= 64;
        asbtVar6.h = zL8;
        aihfVarCreateBuilder.copyOnWrite();
        asbu asbuVar = (asbu) aihfVarCreateBuilder.instance;
        asbt asbtVar7 = (asbt) aihfVarCreateBuilder2.build();
        asbtVar7.getClass();
        asbuVar.d = asbtVar7;
        asbuVar.c |= 2;
        aihhVar.e(aihlVar2, (asbu) aihfVarCreateBuilder.build());
        if (l != null) {
            aihl aihlVar3 = asbs.b;
            aihf aihfVarCreateBuilder3 = asbs.a.createBuilder();
            long jLongValue = l.longValue();
            aihfVarCreateBuilder3.copyOnWrite();
            asbs asbsVar = (asbs) aihfVarCreateBuilder3.instance;
            asbsVar.c |= 1;
            asbsVar.d = jLongValue;
            aihhVar.e(aihlVar3, (asbs) aihfVarCreateBuilder3.build());
        }
        agqr it = ((agpk) ((agpn) map).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null && entry.getValue() != null && !((Integer) entry.getKey()).equals(entry.getValue())) {
                Integer num = (Integer) entry.getKey();
                num.intValue();
                Integer num2 = (Integer) entry.getValue();
                num2.intValue();
                aihhVar.copyOnWrite();
                asbq asbqVar4 = (asbq) aihhVar.instance;
                aiip aiipVar = asbqVar4.d;
                if (!aiipVar.b) {
                    asbqVar4.d = aiipVar.a();
                }
                asbqVar4.d.put(num, num2);
            }
        }
        return (asbq) aihhVar.build();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, zwy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, zwy] */
    public final void D() {
        wah wahVar = (wah) this.e.io();
        if (((vxz) this.a).l(7, 45400147L, false)) {
            String str = (String) wahVar.a.io();
            ?? r2 = this.b;
            r2.k(str);
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            amiuVar.f = 148;
            amiuVar.b |= 4;
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
            str.getClass();
            amiuVar2.b |= 8;
            amiuVar2.g = str;
            r2.i((amiu) aihfVarCreateBuilder.build());
        } else {
            this.b.t(149);
        }
        wahVar.a("DataPushSharedEnvironmentInit", new lph(this, wahVar, 19, (byte[]) null));
    }

    public final vun E(agkz agkzVar) {
        if (((vxz) this.c).l(287, 45729743L, false)) {
            agqr it = agkzVar.iterator();
            if (it.hasNext()) {
                int iOrdinal = ((akua) it.next()).ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return vun.b;
                    }
                    if (iOrdinal == 3) {
                        return vun.a;
                    }
                    if (iOrdinal == 4) {
                        return vun.e;
                    }
                }
                return vun.c;
            }
        }
        return vun.c;
    }

    public final vun F(boolean z, agkz agkzVar) {
        return (vun) K(z, agkzVar).e(E(agkzVar));
    }

    public final vuv H(vun vunVar, vun vunVar2) {
        return (((vpc) this.b).g().g() && vunVar == vun.d) ? new vuv(vunVar2, true) : new vuv(vunVar, false);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, vul] */
    public final boolean I(agkz agkzVar) {
        return ((vxz) this.c).l(204, 45685365L, false) && this.d.b() > 0 && agkzVar.contains(akua.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_MINI_PLAYER);
    }

    public final boolean J(agkz agkzVar) {
        return I(agkzVar) && !agkzVar.contains(akua.ENGAGEMENT_PANEL_SNAP_STATE_FULL_BLEED);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [awmd, java.lang.Object] */
    public final vnw L(xgn xgnVar, amdd amddVar, vnv vnvVar) {
        Activity activity = (Activity) this.e.io();
        activity.getClass();
        acxt acxtVar = (acxt) this.b.io();
        acxtVar.getClass();
        acxn acxnVar = (acxn) this.d.io();
        acxnVar.getClass();
        vxz vxzVar = (vxz) this.a.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) this.c.io();
        vxzVar2.getClass();
        xgnVar.getClass();
        return new vnw(activity, acxtVar, acxnVar, vxzVar, vxzVar2, xgnVar, amddVar, vnvVar);
    }

    public final afxd O(zwa zwaVar, Executor executor) {
        return afxd.f(((afid) this.a).a()).h(new idm(this, zwaVar, 13), executor).h(new idm(this, executor, 14), MoreExecutors.directExecutor());
    }

    public final ListenableFuture P(affd affdVar) {
        if (affdVar != null) {
            return ((afgj) this.d).a();
        }
        zvp.a(zvn.b, zvm.z, "[Clockwork][DefaultTikTokBridge] notifyRequirementStateChanged: AccountId was null");
        return ahng.m(new IllegalStateException("AccountId was null"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture Q(zwa zwaVar) {
        afxd afxdVarO = O(zwaVar, this.b);
        taf.h(afxdVarO, this.c, new iul(12));
        return afxdVarO;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    public final qfg V(Executor executor, aunn aunnVar, awmd awmdVar) {
        qfe qfeVar = (qfe) this.a.io();
        qfeVar.getClass();
        qcs qcsVar = (qcs) this.c.io();
        qcsVar.getClass();
        rrq rrqVar = (rrq) this.b.io();
        rrqVar.getClass();
        executor.getClass();
        aunnVar.getClass();
        return new qfg(qfeVar, this.d, qcsVar, rrqVar, this.e, executor, aunnVar, awmdVar);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, pkm] */
    public final Object W(pxk pxkVar, awoq awoqVar) throws Throwable {
        pkp pkpVar;
        ahzd ahzdVar;
        ahze ahzeVar;
        ahze ahzeVar2;
        ahzg ahzgVar;
        ahzd ahzdVar2;
        if (awoqVar instanceof pkp) {
            pkpVar = (pkp) awoqVar;
            int i = pkpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pkpVar.b = i - Integer.MIN_VALUE;
            } else {
                pkpVar = new pkp(this, awoqVar);
            }
        } else {
            pkpVar = new pkp(this, awoqVar);
        }
        Object objA = pkpVar.a;
        awox awoxVar = awox.a;
        int i2 = pkpVar.b;
        int i3 = 3;
        if (i2 == 0) {
            atqp.j(objA);
            ahzg ahzgVar2 = null;
            try {
                Object systemService = ((pkn) this.a).b.getSystemService("power");
                systemService.getClass();
                boolean zIsInteractive = ((PowerManager) systemService).isInteractive();
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                int i4 = runningAppProcessInfo.importance == 100 ? 3 : 4;
                aihf aihfVarCreateBuilder = ahzd.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ahzd ahzdVar3 = (ahzd) aihfVarCreateBuilder.instance;
                ahzdVar3.c = i4 - 1;
                ahzdVar3.b |= 1;
                aihf aihfVarCreateBuilder2 = ahzc.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                ahzc ahzcVar = (ahzc) aihfVarCreateBuilder2.instance;
                ahzcVar.b |= 1;
                ahzcVar.c = zIsInteractive;
                aihfVarCreateBuilder.copyOnWrite();
                ahzd ahzdVar4 = (ahzd) aihfVarCreateBuilder.instance;
                ahzc ahzcVar2 = (ahzc) aihfVarCreateBuilder2.build();
                ahzcVar2.getClass();
                ahzdVar4.d = ahzcVar2;
                ahzdVar4.b |= 2;
                ahzdVar = (ahzd) aihfVarCreateBuilder.build();
            } catch (Exception e) {
                ((agsj) ((agsj) pkn.a.c()).j(e)).t("Failed to get app state.");
                ahzdVar = null;
            }
            try {
                Context context = ((pko) this.d).b;
                Object systemService2 = context.getSystemService("batterymanager");
                systemService2.getClass();
                BatteryManager batteryManager = (BatteryManager) systemService2;
                boolean zIsCharging = batteryManager.isCharging();
                float intProperty = batteryManager.getIntProperty(4) / 100.0f;
                Object systemService3 = context.getSystemService("power");
                systemService3.getClass();
                boolean zIsPowerSaveMode = ((PowerManager) systemService3).isPowerSaveMode();
                aihf aihfVarCreateBuilder3 = ahze.a.createBuilder();
                int iA = nwu.a(zIsCharging);
                aihfVarCreateBuilder3.copyOnWrite();
                ahze ahzeVar3 = (ahze) aihfVarCreateBuilder3.instance;
                ahzeVar3.c = iA - 1;
                ahzeVar3.b |= 1;
                int iA2 = nwu.a(zIsPowerSaveMode);
                aihfVarCreateBuilder3.copyOnWrite();
                ahze ahzeVar4 = (ahze) aihfVarCreateBuilder3.instance;
                ahzeVar4.d = iA2 - 1;
                ahzeVar4.b |= 2;
                aihfVarCreateBuilder3.copyOnWrite();
                ahze ahzeVar5 = (ahze) aihfVarCreateBuilder3.instance;
                ahzeVar5.b |= 4;
                ahzeVar5.e = intProperty;
                aihfVarCreateBuilder3.copyOnWrite();
                ahze ahzeVar6 = (ahze) aihfVarCreateBuilder3.instance;
                ahzeVar6.b |= 8;
                ahzeVar6.f = 0.0f;
                ahzeVar = (ahze) aihfVarCreateBuilder3.build();
            } catch (Exception e2) {
                ((agsj) ((agsj) pko.a.c()).j(e2)).t("Failed to get battery state.");
                ahzeVar = null;
            }
            try {
                Context context2 = ((pkq) this.b).b;
                if (avg.c(context2, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                    Object systemService4 = context2.getSystemService("connectivity");
                    systemService4.getClass();
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService4;
                    aihf aihfVarCreateBuilder4 = ahzg.a.createBuilder();
                    aihfVarCreateBuilder4.getClass();
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(1)) {
                            aihfVarCreateBuilder4.copyOnWrite();
                            ahzg ahzgVar3 = (ahzg) aihfVarCreateBuilder4.instance;
                            ahzgVar3.c = 2;
                            ahzgVar3.b |= 1;
                            int iA3 = nwu.a(false);
                            aihfVarCreateBuilder4.copyOnWrite();
                            ahzg ahzgVar4 = (ahzg) aihfVarCreateBuilder4.instance;
                            ahzgVar4.e = iA3 - 1;
                            ahzgVar4.b |= 4;
                        } else if (networkCapabilities.hasTransport(0)) {
                            aihfVarCreateBuilder4.copyOnWrite();
                            ahzg ahzgVar5 = (ahzg) aihfVarCreateBuilder4.instance;
                            ahzgVar5.c = 1;
                            ahzgVar5.b |= 1;
                            if (a.aK()) {
                                int iA4 = nwu.a(!networkCapabilities.hasCapability(18));
                                aihfVarCreateBuilder4.copyOnWrite();
                                ahzg ahzgVar6 = (ahzg) aihfVarCreateBuilder4.instance;
                                ahzgVar6.e = iA4 - 1;
                                ahzgVar6.b |= 4;
                            } else {
                                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                if (activeNetworkInfo != null) {
                                    int iA5 = nwu.a(activeNetworkInfo.isRoaming());
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    ahzg ahzgVar7 = (ahzg) aihfVarCreateBuilder4.instance;
                                    ahzgVar7.e = iA5 - 1;
                                    ahzgVar7.b |= 4;
                                } else {
                                    aihfVarCreateBuilder4.copyOnWrite();
                                    ahzg ahzgVar8 = (ahzg) aihfVarCreateBuilder4.instance;
                                    ahzgVar8.e = 0;
                                    ahzgVar8.b |= 4;
                                }
                            }
                        }
                        int iA6 = nwu.a(connectivityManager.isActiveNetworkMetered());
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahzg ahzgVar9 = (ahzg) aihfVarCreateBuilder4.instance;
                        ahzgVar9.d = iA6 - 1;
                        ahzgVar9.b |= 2;
                        ahzgVar2 = (ahzg) aihfVarCreateBuilder4.build();
                    }
                }
            } catch (Exception e3) {
                ((agsj) ((agsj) pkq.a.c()).j(e3)).t("Failed to get network state.");
            }
            ?? r0 = this.c;
            pkpVar.c = ahzdVar;
            pkpVar.d = ahzeVar;
            pkpVar.e = ahzgVar2;
            pkpVar.b = 1;
            objA = r0.a(pxkVar, pkpVar);
            if (objA == awoxVar) {
                return awoxVar;
            }
            ahzeVar2 = ahzeVar;
            ahzgVar = ahzgVar2;
            ahzdVar2 = ahzdVar;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahzgVar = pkpVar.e;
            ahzeVar2 = pkpVar.d;
            ahzdVar2 = pkpVar.c;
            atqp.j(objA);
        }
        ahzk ahzkVar = (ahzk) objA;
        aihf aihfVarCreateBuilder5 = ahzl.a.createBuilder();
        aihfVarCreateBuilder5.getClass();
        if (ahzdVar2 != null) {
            aihfVarCreateBuilder5.copyOnWrite();
            ahzl ahzlVar = (ahzl) aihfVarCreateBuilder5.instance;
            ahzlVar.g = ahzdVar2;
            ahzlVar.b |= 16;
        }
        if (ahzeVar2 != null) {
            aihfVarCreateBuilder5.copyOnWrite();
            ahzl ahzlVar2 = (ahzl) aihfVarCreateBuilder5.instance;
            ahzlVar2.c = ahzeVar2;
            ahzlVar2.b |= 1;
        }
        if (ahzgVar != null) {
            aihfVarCreateBuilder5.copyOnWrite();
            ahzl ahzlVar3 = (ahzl) aihfVarCreateBuilder5.instance;
            ahzlVar3.d = ahzgVar;
            ahzlVar3.b |= 2;
        }
        if (ahzkVar != null) {
            aihfVarCreateBuilder5.copyOnWrite();
            ahzl ahzlVar4 = (ahzl) aihfVarCreateBuilder5.instance;
            ahzlVar4.e = ahzkVar;
            ahzlVar4.b |= 4;
        }
        try {
            Object systemService5 = ((Context) this.e).getSystemService("notification");
            systemService5.getClass();
            int currentInterruptionFilter = ((NotificationManager) systemService5).getCurrentInterruptionFilter();
            if (currentInterruptionFilter == 0) {
                i3 = 1;
            } else if (currentInterruptionFilter == 1) {
                i3 = 2;
            } else if (currentInterruptionFilter == 2) {
                i3 = 4;
            } else if (currentInterruptionFilter != 3) {
                if (currentInterruptionFilter == 4) {
                    i3 = 5;
                } else {
                    i3 = 1;
                }
            }
        } catch (Exception unused) {
        }
        aihfVarCreateBuilder5.copyOnWrite();
        ahzl ahzlVar5 = (ahzl) aihfVarCreateBuilder5.instance;
        ahzlVar5.f = i3 - 1;
        ahzlVar5.b |= 8;
        return aewo.y(aihfVarCreateBuilder5);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final void X(String str) {
        Object obj;
        synchronized (this.b) {
            mgk mgkVar = (mgk) this.c.get(str);
            if (mgkVar != null && (obj = mgkVar.b) != null) {
                avnr.b((AtomicReference) obj);
                mgkVar.b = null;
            }
        }
    }

    public final jsq Y(String str) {
        return (jsq) ((HashMap) this.d).get(str);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, jss] */
    public final jsq Z(String str) {
        HashMap map = (HashMap) this.d;
        jsq jsqVar = (jsq) map.get(str);
        if (jsqVar != null) {
            return jsqVar;
        }
        SparseArray sparseArray = (SparseArray) this.e;
        int iM = rpi.M(sparseArray);
        jsq jsqVar2 = new jsq(iM, str, jsv.a);
        map.put(str, jsqVar2);
        sparseArray.put(iM, str);
        ((SparseBooleanArray) this.a).put(iM, true);
        this.c.g();
        return jsqVar2;
    }

    public final int a() {
        return ((awtp) this.c).b - ((awtp) this.d).b;
    }

    public final Set aa() {
        return ((HashMap) this.d).keySet();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jss] */
    public final void ab() {
        this.c.b((HashMap) this.d);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.b;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.e).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.a).clear();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, jss] */
    public final boolean ad(String str) {
        HashMap map = (HashMap) this.d;
        jsq jsqVar = (jsq) map.get(str);
        if (jsqVar == null || !jsqVar.b() || jsqVar.e) {
            return false;
        }
        map.remove(str);
        int i = jsqVar.a;
        Object obj = this.a;
        ?? r1 = this.c;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) obj;
        boolean z = sparseBooleanArray.get(i);
        r1.f();
        Object obj2 = this.e;
        if (z) {
            ((SparseArray) obj2).remove(i);
            sparseBooleanArray.delete(i);
            return true;
        }
        ((SparseArray) obj2).put(i, null);
        ((SparseBooleanArray) this.b).put(i, true);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [awmd, java.lang.Object] */
    public final onp ae(nvp nvpVar, mlc mlcVar, aigw aigwVar) {
        Optional optional = (Optional) ((aupo) this.b).b;
        optional.getClass();
        Optional optional2 = (Optional) ((aupo) this.c).b;
        optional2.getClass();
        Optional optional3 = (Optional) this.a.io();
        optional3.getClass();
        nvpVar.getClass();
        aigwVar.getClass();
        Optional optional4 = (Optional) this.e.io();
        optional4.getClass();
        Optional optional5 = (Optional) this.d.io();
        optional5.getClass();
        return new onp(optional, optional2, optional3, nvpVar, mlcVar, aigwVar, optional4, optional5);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [awut, java.lang.Object] */
    public final ListenableFuture af(String str, boolean z, boolean z2) {
        str.getClass();
        return awrc.ag(this.d, awov.a, new igm(this, str, z, z2, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fa, code lost:
    
        if (r14 != r1) goto L60;
     */
    /* JADX WARN: Type inference failed for: r10v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [aunn, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ag(java.lang.String r11, boolean r12, boolean r13, defpackage.awoq r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axfd.ag(java.lang.String, boolean, boolean, awoq):java.lang.Object");
    }

    public final Optional ah() {
        hyz hyzVar = (hyz) ((abjp) this.c).k(((jnj) this.e).q());
        return hyzVar instanceof hyw ? Optional.ofNullable((hyw) hyzVar) : Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void ai(hyy hyyVar) {
        this.a.add(hyyVar);
    }

    public final void aj() {
        int i = 11;
        avlh.I(((avlh) this.d).H(new hbz(i)).x(new hgu(10)).H(new hbz(12)), ((avlh) this.b).x(new hgu(i)).H(new hbz(13))).i(new abwr(1)).al(new hxi(this, 6), new hyx(0));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void ak(hyy hyyVar) {
        this.a.remove(hyyVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [awmd, java.lang.Object] */
    public final hwy al(ImageView imageView, View view) {
        Context context = (Context) this.e.io();
        context.getClass();
        ?? Io = this.b.io();
        Io.getClass();
        ?? Io2 = this.d.io();
        Io2.getClass();
        ?? Io3 = this.a.io();
        Io3.getClass();
        adxj adxjVar = (adxj) this.c.io();
        adxjVar.getClass();
        imageView.getClass();
        view.getClass();
        return new hwy(context, Io, Io2, Io3, adxjVar, imageView, view);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [awut, java.lang.Object] */
    public final void am(int i) throws Throwable {
        ((abte) ((ci) this.b).a.io()).d(new xfh(1, 10), alai.FLOW_TYPE_CHIME_REGISTRATION);
        awrc.ag(this.e, awov.a, new hlb(this, i, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    public final ajnf an() {
        anki ankiVarAp = ap(this.b.e());
        if (ankiVarAp != null) {
            apji apjiVar = ankiVarAp.n;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajnp.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = ankiVarAp.n;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajnp.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (ajnf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    public final ajwo ao() {
        anki ankiVarAp = ap(this.b.e());
        if (ankiVarAp != null) {
            ajng ajngVar = ankiVarAp.e;
            if (ajngVar == null) {
                ajngVar = ajng.a;
            }
            ajnf ajnfVar = ajngVar.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
            if ((ajnfVar.b & SemanticState.Obscured) != 0) {
                ajng ajngVar2 = ankiVarAp.e;
                if (ajngVar2 == null) {
                    ajngVar2 = ajng.a;
                }
                ajnf ajnfVar2 = ajngVar2.c;
                if (ajnfVar2 == null) {
                    ajnfVar2 = ajnf.a;
                }
                ajwo ajwoVar = ajnfVar2.r;
                return ajwoVar == null ? ajwo.a : ajwoVar;
            }
        }
        return vxh.a(true != at() ? "SPunlimited" : "SPmanage_red");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final anki ap(zwa zwaVar) {
        anki ankiVar = (anki) ((ConcurrentHashMap) this.c).get(zwaVar.k());
        if (ankiVar != null) {
            return ankiVar;
        }
        String string = this.d.getString("last_known_browse_metadata_".concat(zwaVar.k()), null);
        if (string == null) {
            return null;
        }
        try {
            return (anki) aihn.parseFrom(anki.a, Base64.decode(string, 0), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik | IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    public final CharSequence aq() {
        anki ankiVarAp = ap(this.b.e());
        if (ankiVarAp == null) {
            return null;
        }
        ajng ajngVar = ankiVarAp.e;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        ajnf ajnfVar = ajngVar.c;
        if (ajnfVar == null) {
            ajnfVar = ajnf.a;
        }
        if ((ajnfVar.b & 64) == 0) {
            return null;
        }
        ajng ajngVar2 = ankiVarAp.e;
        if (ajngVar2 == null) {
            ajngVar2 = ajng.a;
        }
        ajnf ajnfVar2 = ajngVar2.c;
        if (ajnfVar2 == null) {
            ajnfVar2 = ajnf.a;
        }
        alay alayVar = ajnfVar2.m;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        return ackj.k(null, alayVar, null, false);
    }

    public final void ar(zwa zwaVar, boolean z) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        anki ankiVar = (anki) concurrentHashMap.get(zwaVar.k());
        aihf builder = ankiVar != null ? ankiVar.toBuilder() : anki.a.createBuilder();
        builder.copyOnWrite();
        anki ankiVar2 = (anki) builder.instance;
        ankiVar2.b |= 8;
        ankiVar2.g = z;
        aA("last_known_browse_metadata_".concat(zwaVar.k()), builder.build());
        concurrentHashMap.put(zwaVar.k(), (anki) builder.build());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    public final boolean as() {
        anki ankiVarAp = ap(this.b.e());
        return ankiVarAp != null && ankiVarAp.j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    public final boolean at() {
        anki ankiVarAp = ap(this.b.e());
        return ankiVarAp != null && ankiVarAp.g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwb] */
    public final boolean au() {
        anki ankiVarAp = ap(this.b.e());
        return ankiVarAp == null || ankiVarAp.h;
    }

    public final void av(zwa zwaVar, aihf aihfVar) {
        gzg gzgVar;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        anki ankiVar = (anki) concurrentHashMap.get(zwaVar.k());
        if (ankiVar == null || !ankiVar.equals(aihfVar.build())) {
            aA("last_known_browse_metadata_".concat(zwaVar.k()), aihfVar.build());
            concurrentHashMap.put(zwaVar.k(), (anki) aihfVar.build());
            for (WeakReference weakReference : (CopyOnWriteArrayList) this.e) {
                if (weakReference != null && (gzgVar = (gzg) weakReference.get()) != null) {
                    gzgVar.x(this);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [egd, java.lang.Object] */
    public final /* synthetic */ void aw(Runnable runnable) {
        this.a.execute(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void ax(String str, Object obj) {
        str.getClass();
        this.c.put(str, obj);
        axaf axafVar = (axaf) this.a.get(str);
        if (axafVar != null) {
            axafVar.d(obj);
        }
        axaf axafVar2 = (axaf) this.e.get(str);
        if (axafVar2 != null) {
            axafVar2.d(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void ay(String str) {
        this.c.remove(str);
        this.a.remove(str);
        this.e.remove(str);
    }

    public final axez b(axez axezVar) {
        if (a() == 127) {
            return axezVar;
        }
        if (axezVar.h) {
            ((awtp) this.e).b();
        }
        awtp awtpVar = (awtp) this.c;
        int i = awtpVar.b & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, axezVar);
                awtpVar.b();
                return null;
            }
            Thread.yield();
        }
    }

    public final axez c() {
        axez axezVar;
        while (true) {
            Object obj = this.d;
            Object obj2 = this.c;
            awtp awtpVar = (awtp) obj;
            int i = awtpVar.b;
            axezVar = null;
            if (i - ((awtp) obj2).b == 0) {
                break;
            }
            int i2 = i & 127;
            if (awtpVar.c(i, i + 1) && (axezVar = (axez) ((AtomicReferenceArray) this.a).getAndSet(i2, null)) != null) {
                if (!axezVar.h) {
                    break;
                }
                ((awtp) this.e).a();
                boolean z = awuv.a;
                break;
            }
        }
        return axezVar;
    }

    public final axez d(int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
        int i2 = i & 127;
        axez axezVar = (axez) atomicReferenceArray.get(i2);
        if (axezVar != null && axezVar.h == z) {
            while (!atomicReferenceArray.compareAndSet(i2, axezVar, null)) {
                if (atomicReferenceArray.get(i2) != axezVar) {
                }
            }
            if (!z) {
                return axezVar;
            }
            ((awtp) this.e).a();
            return axezVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void e(boolean z) {
        if (z) {
            this.b.execute(new afjc(this, 10));
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [ahrw, java.lang.Object] */
    public final lpa f() {
        lpa lpaVarL;
        int iB;
        boolean zG = g();
        int i = 3;
        if (zG && ((ahtf) this.c).a() >= 261200000) {
            ?? r0 = this.d;
            ExecutorService executorServiceN = ahno.n();
            return r0.l().b(executorServiceN, new kji(this, executorServiceN, i)).b(executorServiceN, new kji(this, executorServiceN, 4));
        }
        Object obj = this.b;
        ahtd ahtdVar = (ahtd) obj;
        ahnr ahnrVar = ahtdVar.a;
        String strG = a.g(ahnrVar);
        Bundle bundle = new Bundle();
        try {
            bundle.putString("scope", "*");
            bundle.putString("sender", strG);
            bundle.putString("subtype", strG);
            bundle.putString("gmp_app_id", ahnrVar.e().b);
            ahtf ahtfVar = ((ahtd) obj).b;
            bundle.putString("gmsv", Integer.toString(ahtfVar.a()));
            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
            bundle.putString("app_ver", ahtfVar.c());
            bundle.putString("app_ver_name", ahtfVar.d());
            bundle.putString("firebase-app-name-hash", ((ahtd) obj).a());
            if (zG) {
                bundle.putString("Goog-Api-Key", ahnrVar.e().a);
            }
            try {
                String str = ((ahsa) mda.n(((ahtd) obj).f.l())).a;
                if (TextUtils.isEmpty(str)) {
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                } else {
                    bundle.putString("Goog-Firebase-Installations-Auth", str);
                }
            } catch (InterruptedException | ExecutionException e) {
                Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            }
            bundle.putString("appid", (String) mda.n(((ahtd) obj).f.a()));
            bundle.putString("cliv", "fcm-25.1.2_1p");
            ahrd ahrdVar = (ahrd) ((ahtd) obj).e.a();
            ahuh ahuhVar = (ahuh) ((ahtd) obj).d.a();
            if (ahrdVar != null && ahuhVar != null && (iB = ahrdVar.b()) != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(iB - 1));
                bundle.putString("Firebase-Client", ahuhVar.a());
            }
            lpaVarL = ahtdVar.c.b(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            lpaVarL = mda.l(e2);
        }
        return lpaVarL.a(new vp(10), new klg(i));
    }

    public final boolean g() {
        Context contextA = ((ahnr) this.e).a();
        try {
            PackageManager packageManager = contextA.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), SemanticState.Focused);
                if (applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_installation_id_enabled")) {
                    return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    public final ListenableFuture i(afgp afgpVar, List list, afff afffVar) {
        Object obj;
        ArrayList arrayList = new ArrayList(((agpi) list).d);
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (true) {
            byte[] bArr = null;
            if (!agqsVarListIterator.hasNext()) {
                ListenableFuture listenableFutureAF = aguu.aF(arrayList, new idn(11), MoreExecutors.directExecutor());
                idm idmVar = new idm(this, afffVar, 17, bArr);
                long j = afwl.a;
                ahdb ahdbVar = new ahdb(afty.c(false), idmVar, 1);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                int i = ahcs.c;
                ahcq ahcqVar = new ahcq(listenableFutureAF, ahdbVar);
                listenableFutureAF.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
                return ahcqVar;
            }
            Class cls = (Class) agqsVarListIterator.next();
            if (afgm.class.isAssignableFrom(cls)) {
                ahno.R(!afgo.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                ?? r4 = this.d;
                ahno.R(r4.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                obj = r4.get(cls);
            } else {
                if (!afgo.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("No selector registered for key: ".concat(String.valueOf(String.valueOf(cls))));
                }
                ahno.R(!afgm.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                ?? r5 = this.b;
                ahno.R(r5.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                obj = r5.get(cls);
            }
            arrayList.add(new jnu((awmd) obj, afgpVar, 7, bArr));
        }
    }

    public final agke j() {
        return (agke) ((afgj) this.a).c.io();
    }

    public final ListenableFuture k(affd affdVar, Intent intent, afff afffVar) {
        agke agkeVarJ = j();
        afuu afuuVarD = afwt.d(105, "Validate Requirements", afux.a, true);
        try {
            ListenableFuture listenableFutureA = ((afgj) this.a).b.a(affdVar);
            idm idmVar = new idm(agkeVarJ, affdVar, 16, null);
            long j = afwl.a;
            ahdb ahdbVar = new ahdb(afty.c(false), idmVar, 1);
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            ahcq ahcqVar = new ahcq(listenableFutureA, ahdbVar);
            listenableFutureA.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
            afuuVarD.a(ahcqVar);
            afuuVarD.close();
            ahdb ahdbVar2 = new ahdb(afty.c(false), new okv(this, affdVar, afffVar, 7), 1);
            Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
            ahcq ahcqVar2 = new ahcq(ahcqVar, ahdbVar2);
            ahcqVar.addListener(ahcqVar2, MoreExecutors.c(executorDirectExecutor2, ahcqVar2));
            return ahcqVar2;
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final avlh l() {
        int i = 0;
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            Context context = (Context) this.e;
            Optional optionalOfNullable = Optional.ofNullable((PowerManager) context.getSystemService("power"));
            aerg aergVar = new aerg(this, i);
            if (true == optionalOfNullable.isPresent()) {
                Object obj = optionalOfNullable.get();
                Object obj2 = aergVar.a;
                ((awkv) ((axfd) obj2).d).kk(Boolean.valueOf(((PowerManager) obj).isPowerSaveMode()));
            }
            int i2 = Build.VERSION.SDK_INT;
            Object obj3 = this.c;
            if (i2 >= 33) {
                context.registerReceiver((BroadcastReceiver) obj3, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), 4);
            } else {
                context.registerReceiver((BroadcastReceiver) obj3, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
            }
        }
        return (avlh) this.a;
    }

    public final ListenableFuture n(abnl abnlVar, abnp abnpVar) {
        return q(abnlVar, abnpVar != null ? abnpVar.b : null);
    }

    public final void o(wgi wgiVar, zza zzaVar, xir xirVar) {
        ((tbt) this.b).c(new aayl());
        if (xirVar != null) {
            xirVar.n("wn_r");
        }
        zzaVar.a(wgiVar);
    }

    public final void p(abnl abnlVar, zza zzaVar, xir xirVar) {
        String strW = abnlVar.w();
        if (TextUtils.isEmpty(strW)) {
            if (abnlVar.a.e.size() > 0) {
                jrk jrkVar = abnlVar.a;
                strW = (String) jrkVar.e.get(Math.max(0, abnlVar.a()));
            } else {
                strW = "";
            }
        }
        r(strW, abnlVar.u(), abnlVar.v(), abnlVar.a(), abnlVar.r(), abnlVar.Q(), zzaVar, xirVar, abnlVar.m(), abnlVar.n(), abnlVar.k());
    }

    public final ListenableFuture q(abnl abnlVar, xir xirVar) {
        zyz zyzVar = new zyz();
        p(abnlVar, zyzVar, xirVar);
        return zyzVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, mbc] */
    public final void r(String str, String str2, String str3, int i, String str4, byte[] bArr, zza zzaVar, xir xirVar, Optional optional, Optional optional2, Optional optional3) {
        aaym aaymVar = new aaym();
        tbt tbtVar = (tbt) this.b;
        tbtVar.c(aaymVar);
        if (xirVar != null) {
            xirVar.n("wn_s");
        }
        wuq wuqVarM = m(tbtVar, (wup) this.a, str, str2, str3, i, str4, bArr, optional, optional2, optional3, xirVar);
        wuqVarM.h = false;
        String strY = wuqVarM.Y();
        if (wuqVarM.w()) {
            wgi wgiVar = null;
            if (!TextUtils.isEmpty(strY)) {
                abqw abqwVar = (abqw) this.c;
                abqv abqvVar = (abqv) abqwVar.get(strY);
                if (abqvVar != null) {
                    if (abqvVar.b > this.e.b()) {
                        wgiVar = abqvVar.a;
                    } else {
                        abqwVar.remove(strY);
                    }
                }
            }
            if (wgiVar != null) {
                o(wgiVar, zzaVar, xirVar);
                return;
            }
        }
        Object obj = this.d;
        wuo wuoVar = (wuo) obj;
        wuoVar.c.j(wuqVarM, new abqr(this, strY, zzaVar, xirVar, wuqVarM.x()), wuoVar.h());
    }

    public final void s(String str) {
        Object obj = this.a;
        if (obj != null) {
            synchronized (obj) {
                ((AtomicLong) this.b).incrementAndGet();
                ((ConcurrentHashMap) obj).remove(str);
            }
        }
    }

    public final SQLiteDatabase t() {
        return ((aaev) this.e).d();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:15:0x0044, B:17:0x004a, B:20:0x0066, B:21:0x0070, B:23:0x0076, B:25:0x0083, B:27:0x008f, B:29:0x0096, B:32:0x00a2, B:34:0x00af, B:36:0x00b5, B:37:0x00b8, B:54:0x00eb, B:38:0x00b9, B:40:0x00c3, B:42:0x00c5, B:45:0x00d2, B:47:0x00d8, B:48:0x00da, B:50:0x00dc, B:51:0x00e7), top: B:62:0x0044, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0076 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:15:0x0044, B:17:0x004a, B:20:0x0066, B:21:0x0070, B:23:0x0076, B:25:0x0083, B:27:0x008f, B:29:0x0096, B:32:0x00a2, B:34:0x00af, B:36:0x00b5, B:37:0x00b8, B:54:0x00eb, B:38:0x00b9, B:40:0x00c3, B:42:0x00c5, B:45:0x00d2, B:47:0x00d8, B:48:0x00da, B:50:0x00dc, B:51:0x00e7), top: B:62:0x0044, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8 A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #0 {all -> 0x00f5, blocks: (B:15:0x0044, B:17:0x004a, B:20:0x0066, B:21:0x0070, B:23:0x0076, B:25:0x0083, B:27:0x008f, B:29:0x0096, B:32:0x00a2, B:34:0x00af, B:36:0x00b5, B:37:0x00b8, B:54:0x00eb, B:38:0x00b9, B:40:0x00c3, B:42:0x00c5, B:45:0x00d2, B:47:0x00d8, B:48:0x00da, B:50:0x00dc, B:51:0x00e7), top: B:62:0x0044, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[Catch: all -> 0x00ec, DONT_GENERATE, TryCatch #1 {, blocks: (B:38:0x00b9, B:40:0x00c3, B:42:0x00c5, B:45:0x00d2, B:47:0x00d8, B:48:0x00da, B:50:0x00dc, B:51:0x00e7), top: B:63:0x00b9, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[Catch: all -> 0x00ec, TryCatch #1 {, blocks: (B:38:0x00b9, B:40:0x00c3, B:42:0x00c5, B:45:0x00d2, B:47:0x00d8, B:48:0x00da, B:50:0x00dc, B:51:0x00e7), top: B:63:0x00b9, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    public final aaok v(String str) {
        String str2;
        Object obj;
        Object obj2;
        long j;
        Cursor cursorQuery;
        aaok aaokVarA;
        Iterator it;
        Object obj3;
        aami aamiVar;
        aami aamiVar2;
        Uri uriA;
        Object obj4 = this.a;
        int i = 1;
        Object obj5 = null;
        if (obj4 != null) {
            str2 = str;
            aami aamiVar3 = (aami) ((ConcurrentHashMap) obj4).get(str2);
            if (aamiVar3 != null && aamiVar3.a == 1) {
                obj = aamiVar3.b;
            }
            if (obj != null) {
                return (aaok) obj;
            }
            obj2 = this.b;
            j = ((AtomicLong) obj2).get();
            cursorQuery = t().query("channelsV13", aaeo.a, "id = ?", new String[]{str2}, null, null, null, null);
            try {
                if (cursorQuery.moveToNext() && (aaokVarA = aaen.a(cursorQuery, (aalf) this.c.io(), cursorQuery.getColumnIndexOrThrow("id"), cursorQuery.getColumnIndexOrThrow("offline_channel_data_proto"))) != null) {
                    if (obj4 != null) {
                        it = ((abuz) aaokVarA.c).b.iterator();
                        while (it.hasNext()) {
                            uriA = ((wgg) it.next()).a();
                            int i2 = 2;
                            if (uriA == null && "file".equals(uriA.getScheme())) {
                                String path = uriA.getPath();
                                i2 = 3;
                                if (path == null || !new File(path).exists()) {
                                }
                            }
                            i = i2;
                        }
                        obj3 = aaokVarA.b;
                        aamiVar = (aami) ((ConcurrentHashMap) obj4).get(obj3);
                        if (aamiVar == null && aamiVar.b(i)) {
                            obj5 = aamiVar.b;
                        } else {
                            synchronized (obj4) {
                                if (((AtomicLong) obj2).get() == j) {
                                    aamiVar2 = (aami) ((ConcurrentHashMap) obj4).get(obj3);
                                    if (aamiVar2 == null && aamiVar2 != aamiVar && aamiVar2.b(i)) {
                                        obj5 = aamiVar2.b;
                                    } else {
                                        ((ConcurrentHashMap) obj4).put(obj3, new aami(aaokVarA, i, null));
                                    }
                                }
                                obj5 = aaokVarA;
                            }
                        }
                    } else {
                        obj5 = aaokVarA;
                    }
                }
                cursorQuery.close();
                return (aaok) obj5;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        str2 = str;
        obj = null;
        if (obj != null) {
            return (aaok) obj;
        }
        obj2 = this.b;
        j = ((AtomicLong) obj2).get();
        cursorQuery = t().query("channelsV13", aaeo.a, "id = ?", new String[]{str2}, null, null, null, null);
        if (cursorQuery.moveToNext()) {
            if (obj4 != null) {
                it = ((abuz) aaokVarA.c).b.iterator();
                while (it.hasNext()) {
                    uriA = ((wgg) it.next()).a();
                    int i3 = 2;
                    if (uriA == null) {
                    }
                    i = i3;
                }
                obj3 = aaokVarA.b;
                aamiVar = (aami) ((ConcurrentHashMap) obj4).get(obj3);
                if (aamiVar == null) {
                    synchronized (obj4) {
                        if (((AtomicLong) obj2).get() == j) {
                            aamiVar2 = (aami) ((ConcurrentHashMap) obj4).get(obj3);
                            if (aamiVar2 == null) {
                            }
                            ((ConcurrentHashMap) obj4).put(obj3, new aami(aaokVarA, i, null));
                        }
                        obj5 = aaokVarA;
                    }
                } else {
                    synchronized (obj4) {
                        if (((AtomicLong) obj2).get() == j) {
                            aamiVar2 = (aami) ((ConcurrentHashMap) obj4).get(obj3);
                            if (aamiVar2 == null) {
                            }
                            ((ConcurrentHashMap) obj4).put(obj3, new aami(aaokVarA, i, null));
                        }
                        obj5 = aaokVarA;
                    }
                }
            } else {
                obj5 = aaokVarA;
            }
        }
        cursorQuery.close();
        return (aaok) obj5;
    }

    public final void w(aaok aaokVar) {
        t().insertOrThrow("channelsV13", null, u(aaokVar));
        s((String) aaokVar.b);
    }

    public final void x(aaok aaokVar) {
        ContentValues contentValuesU = u(aaokVar);
        SQLiteDatabase sQLiteDatabaseT = t();
        String str = (String) aaokVar.b;
        long jUpdate = sQLiteDatabaseT.update("channelsV13", contentValuesU, "id = ?", new String[]{str});
        s(str);
        if (jUpdate != 1) {
            throw new SQLException(a.cf(jUpdate, "Update channel affected ", " rows"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized jsk y(File file) {
        ?? r0 = this.a;
        String absolutePath = file.getAbsolutePath();
        if (r0.containsKey(absolutePath)) {
            return (jsk) r0.get(absolutePath);
        }
        Object obj = this.b;
        vxz vxzVar = ((aauk) obj).b;
        ahsm ahsmVar = new ahsm((xeu) (vxzVar.l(R.styleable.AppCompatTheme_windowMinWidthMinor, 45627725L, false) ? this.d : null), new aadd(), vxzVar.m(138, 45631408L));
        vxz vxzVar2 = ((aauk) obj).c;
        boolean zM = vxzVar2.m(281, 45696320L);
        boolean zM2 = vxzVar2.m(280, 45696319L);
        jtc jtcVar = new jtc(file, new jsz(), new axfd(file, ((dov) this.e).ai(this.c).getEncoded(), true, zM2, zM), ahsmVar, !vxzVar.l(152, 45638738L, false), zM2, zM);
        r0.put(absolutePath, jtcVar);
        return jtcVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized void z() {
        ?? r0 = this.a;
        Iterator it = r0.values().iterator();
        while (it.hasNext()) {
            ((jsk) it.next()).k();
        }
        r0.clear();
    }

    public axfd(Context context, vul vulVar, vtm vtmVar, vpc vpcVar, vxz vxzVar) {
        this.a = context;
        this.d = vulVar;
        this.e = vtmVar;
        this.b = vpcVar;
        this.c = vxzVar;
    }

    public axfd(awmd awmdVar, Context context, xla xlaVar, vxz vxzVar) {
        this.b = awmdVar;
        this.d = "m";
        this.e = context;
        this.a = xlaVar;
        this.c = vxzVar;
    }

    public axfd(awmd awmdVar, zwy zwyVar, vxz vxzVar, awmd awmdVar2, awmd awmdVar3) {
        this.c = awmdVar;
        this.b = zwyVar;
        this.a = vxzVar;
        this.d = awmdVar2;
        this.e = awmdVar3;
    }

    public axfd(ejz ejzVar, eka ekaVar, eka ekaVar2, eka ekaVar3, eka ekaVar4) {
        this.e = ejzVar;
        this.b = ekaVar;
        this.a = ekaVar2;
        this.d = ekaVar3;
        this.c = ekaVar4;
    }

    public axfd(hld hldVar, aaas aaasVar, Context context, mbc mbcVar, vyo vyoVar) {
        this.a = aaasVar;
        this.e = hldVar;
        this.c = context;
        this.d = mbcVar;
        this.b = vyoVar;
    }

    public axfd(Object obj, adcj adcjVar, adch adchVar, adci adciVar, agex agexVar) {
        this.b = obj;
        this.a = adcjVar;
        this.e = adchVar;
        this.c = adciVar;
        this.d = agexVar;
    }

    public axfd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.d = obj;
        this.e = obj2;
        this.a = obj3;
        this.b = obj4;
        this.c = obj5;
    }

    public axfd(tbt tbtVar, wuo wuoVar, wup wupVar, abqw abqwVar, mbc mbcVar) {
        this.b = tbtVar;
        this.d = wuoVar;
        this.a = wupVar;
        this.c = abqwVar;
        this.e = mbcVar;
    }

    public axfd(vyo vyoVar, abnc abncVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.e = vyoVar;
        this.a = abncVar;
        this.d = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
    }

    public axfd(Context context) {
        this.b = new AtomicBoolean(false);
        this.e = context;
        awkv awkvVarAI = new awku().aI();
        this.d = awkvVarAI;
        this.c = new aerh(awkvVarAI);
        this.a = awkvVarAI.p();
    }

    public axfd(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = new Object();
        this.e = new ArrayList();
        this.c = new HashMap();
        this.b = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.b);
        this.d = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiver(this) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                private final WeakReference a;

                {
                    super(null);
                    this.a = new WeakReference(this);
                }

                /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
                @Override // android.os.ResultReceiver
                protected final void onReceiveResult(int i, Bundle bundle) {
                    eq eoVar;
                    dtr dtrVar;
                    axfd axfdVar = (axfd) this.a.get();
                    if (axfdVar == null || bundle == null) {
                        return;
                    }
                    synchronized (axfdVar.a) {
                        Object obj = axfdVar.b;
                        IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                        if (binder == null) {
                            eoVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            eoVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof eq)) ? new eo(binder) : (eq) iInterfaceQueryLocalInterface;
                        }
                        synchronized (((MediaSessionCompat$Token) obj).a) {
                            try {
                                ((MediaSessionCompat$Token) obj).c = eoVar;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        Object obj2 = axfdVar.b;
                        try {
                            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                            if (bundle2 != null) {
                                bundle2.setClassLoader(dtp.class.getClassLoader());
                                Parcelable parcelable = bundle2.getParcelable("a");
                                if (!(parcelable instanceof ParcelImpl)) {
                                    throw new IllegalArgumentException("Invalid parcel");
                                }
                                dtrVar = ((ParcelImpl) parcelable).a;
                            } else {
                                dtrVar = null;
                            }
                        } catch (RuntimeException unused) {
                        }
                        synchronized (((MediaSessionCompat$Token) obj2).a) {
                            ((MediaSessionCompat$Token) obj2).d = dtrVar;
                        }
                        Object obj3 = axfdVar.b;
                        if (((MediaSessionCompat$Token) obj3).a() != null) {
                            for (et etVar : axfdVar.e) {
                                eu euVar = new eu(etVar);
                                ((HashMap) axfdVar.c).put(etVar, euVar);
                                etVar.c = euVar;
                                try {
                                    ((MediaSessionCompat$Token) obj3).a().b(euVar);
                                    etVar.d(13, null, null);
                                } catch (RemoteException e) {
                                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                                }
                            }
                            axfdVar.e.clear();
                        }
                    }
                }
            });
        }
    }

    public axfd(SharedPreferences sharedPreferences, dov dovVar, aauk aaukVar, xeu xeuVar) {
        this.c = sharedPreferences;
        this.e = dovVar;
        this.b = aaukVar;
        this.d = xeuVar;
        this.a = new HashMap();
    }

    public axfd(SharedPreferences sharedPreferences, zwb zwbVar, aduv aduvVar) {
        this.d = sharedPreferences;
        this.b = zwbVar;
        this.a = aduvVar;
        this.e = new CopyOnWriteArrayList();
        this.c = new ConcurrentHashMap();
    }

    public axfd(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, byte[] bArr) {
        awmdVar.getClass();
        this.e = awmdVar;
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.c = awmdVar5;
    }

    public axfd(Executor executor) {
        this.e = new Handler(Looper.getMainLooper());
        this.d = new ege(this, 0, null);
        efu efuVar = new efu(executor);
        this.a = efuVar;
        awuq awuqVarF = awuw.f(efuVar);
        this.b = awuqVarF;
        awuw.f(new efu(executor));
        this.c = awrc.K(awuqVarF);
    }

    public axfd(mbc mbcVar, zjr zjrVar, avlh avlhVar, avlh avlhVar2, avmb avmbVar) {
        zkf.d(mbcVar);
        this.e = mbcVar;
        zkf.d(zjrVar);
        this.c = zjrVar;
        this.a = avlhVar;
        this.d = avlhVar2;
        this.b = avmbVar;
    }

    public axfd(aaev aaevVar, awmd awmdVar, aauk aaukVar) {
        this.b = new AtomicLong();
        this.e = aaevVar;
        this.c = awmdVar;
        this.d = new ArrayList();
        this.a = aaukVar.b.l(245, 45855755L, false) ? new ConcurrentHashMap() : null;
    }

    public axfd(awmd awmdVar, awmd awmdVar2, ci ciVar, vxz vxzVar, awut awutVar) {
        vxzVar.getClass();
        awutVar.getClass();
        this.a = awmdVar;
        this.c = awmdVar2;
        this.b = ciVar;
        this.d = vxzVar;
        this.e = awutVar;
    }

    public axfd(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        awmdVar.getClass();
        this.e = awmdVar;
        this.b = awmdVar2;
        this.d = awmdVar3;
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.c = awmdVar5;
    }

    public axfd(abhh abhhVar, Map map, Map map2, Set set, afgj afgjVar) {
        this.e = abhhVar;
        this.d = map;
        this.b = map2;
        this.c = set;
        this.a = afgjVar;
        Boolean.FALSE.booleanValue();
    }

    public axfd(abjp abjpVar, avlh avlhVar, avlh avlhVar2, jnj jnjVar, vxz vxzVar) {
        this.c = abjpVar;
        this.d = avlhVar;
        this.b = avlhVar2;
        this.e = jnjVar;
        this.a = new CopyOnWriteArraySet();
        if (vxzVar.l(79, 45735821L, false)) {
            return;
        }
        aj();
    }

    public axfd(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5) {
        this.a = awmdVar;
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
    }

    public axfd(Context context, ahnr ahnrVar, ahrw ahrwVar, ahtd ahtdVar, ahtf ahtfVar) {
        this.a = new klm(context);
        this.e = ahnrVar;
        this.d = ahrwVar;
        this.b = ahtdVar;
        this.c = ahtfVar;
    }

    public axfd(SharedPreferences sharedPreferences, Executor executor) {
        this.c = new ArrayDeque();
        this.a = sharedPreferences;
        this.d = "topic_operation_queue";
        this.e = ",";
        this.b = executor;
    }

    public axfd(awqk awqkVar, awuj awujVar, bgk bgkVar, awou awouVar, dqy dqyVar) {
        awouVar.getClass();
        this.c = awqkVar;
        this.e = awujVar;
        this.d = bgkVar;
        this.a = awouVar;
        this.b = dqyVar;
    }

    public axfd() {
        this.a = new AtomicReferenceArray(SemanticState.Focused);
        awts awtsVar = awts.a;
        this.b = new awtr(null, awtsVar);
        this.c = new awtp(0, awtsVar);
        this.d = new awtp(0, awtsVar);
        this.e = new awtp(0, awtsVar);
    }

    public axfd(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.e = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
    }

    public axfd(Map map) {
        this.c = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.a = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.d = new cn(this, 4);
    }

    public axfd(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, awut awutVar, awou awouVar) {
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        awutVar.getClass();
        awouVar.getClass();
        this.a = aunnVar;
        this.b = aunnVar2;
        this.c = aunnVar3;
        this.d = awutVar;
        this.e = awouVar;
    }

    public axfd(File file, byte[] bArr, boolean z, boolean z2, boolean z3) {
        this.d = new HashMap();
        this.e = new SparseArray();
        this.b = new SparseBooleanArray();
        this.a = new SparseBooleanArray();
        if (z3) {
            this.c = new jst(new File(file, "cached_content_index.exi"), bArr, z, z2);
        } else {
            this.c = new jsr(new File(file, "cached_content_index.exi"), bArr, z, z2);
        }
    }

    public axfd(Context context, kbn kbnVar, kdx kdxVar) {
        String strK;
        if (kbnVar.b().isEmpty()) {
            strK = kro.x(kbnVar.d);
        } else {
            String str = kbnVar.d;
            List listB = kbnVar.b();
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (listB != null) {
                strK = new hed(str, listB).k();
            } else {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
        }
        this.c = new llr(this, 1);
        if (context != null) {
            this.e = context.getApplicationContext();
            kro.i(strK);
            this.d = strK;
            this.a = kbnVar;
            this.b = kdxVar;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public axfd(aunn aunnVar, avmb avmbVar, avmb avmbVar2) {
        this.c = new HashMap();
        this.b = new Object();
        this.e = aunnVar;
        this.d = avmbVar;
        this.a = avmbVar2;
    }

    public axfd(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, char[] cArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
        awmdVar4.getClass();
        this.e = awmdVar4;
        awmdVar5.getClass();
        this.d = awmdVar5;
    }

    public axfd(aboi aboiVar, absg absgVar, tbt tbtVar, Set set, Set set2) {
        this.b = aboiVar;
        this.d = absgVar;
        this.e = tbtVar;
        this.a = set;
        this.c = set2;
    }

    public axfd(Context context, pkj pkjVar, pkk pkkVar, pkl pklVar, pkm pkmVar) {
        context.getClass();
        this.e = context;
        this.a = pkjVar;
        this.d = pkkVar;
        this.b = pklVar;
        this.c = pkmVar;
    }

    public axfd(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
    }

    public axfd(byte[] bArr) {
        this.c = new AtomicBoolean(false);
        this.d = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
    }
}
