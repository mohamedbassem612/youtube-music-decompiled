package defpackage;

import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserManager;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.RealClock;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.upb.TextTypeOuterClass$TextType;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class qnl {
    private static String a;
    private static Boolean b;
    private static nxl c;

    public qnl(char[] cArr) {
        new AtomicReference();
        new AtomicBoolean(false);
    }

    public static boolean A(axgb axgbVar) {
        if (axgbVar != null) {
            return axgbVar.c <= 0 && axgbVar.d <= 0 && axgbVar.e <= 0 && axgbVar.f <= 0 && axgbVar.g <= 0 && axgbVar.h <= 0;
        }
        return true;
    }

    public static boolean B(axgc axgcVar) {
        if (axgcVar != null) {
            return ((long) axgcVar.c) <= 0 && ((long) axgcVar.d) <= 0;
        }
        return true;
    }

    public static boolean C(axge axgeVar) {
        if (axgeVar != null) {
            return axgeVar.d <= 0 && axgeVar.e <= 0 && axgeVar.f <= 0 && axgeVar.g <= 0 && axgeVar.h.size() == 0 && axgeVar.i.size() == 0 && axgeVar.j.size() == 0 && axgeVar.k.size() == 0 && axgeVar.l.size() == 0 && axgeVar.m.size() == 0 && axgeVar.o.size() == 0 && axgeVar.p.size() == 0 && axgeVar.q.size() == 0 && axgeVar.r.size() == 0 && axgeVar.s <= 0 && axgeVar.t <= 0 && axgeVar.u <= 0 && axgeVar.v <= 0 && axgeVar.w <= 0 && axgeVar.x <= 0 && axgeVar.y <= 0 && axgeVar.z <= 0 && axgeVar.A <= 0 && axgeVar.B <= 0 && axgeVar.C <= 0 && axgeVar.D <= 0 && axgeVar.E <= 0 && axgeVar.F <= 0 && axgeVar.H <= 0 && axgeVar.V <= 0 && axgeVar.W <= 0 && axgeVar.X <= 0 && axgeVar.Y <= 0 && axgeVar.Z <= 0 && axgeVar.aa <= 0 && axgeVar.ab <= 0 && axgeVar.ac <= 0 && axgeVar.ad <= 0 && axgeVar.ae <= 0 && axgeVar.af <= 0 && axgeVar.ag <= 0 && axgeVar.ah <= 0 && axgeVar.ai <= 0 && axgeVar.aj <= 0 && axgeVar.al <= 0 && axgeVar.am <= 0 && axgeVar.an <= 0;
        }
        return true;
    }

    public static void D(fxg fxgVar, qet qetVar) {
        DesugarCollections.unmodifiableList(((axge) fxgVar.instance).h);
        for (int i = 0; i < ((axge) fxgVar.instance).h.size(); i++) {
            fxgVar.x(i, qetVar.b(fxgVar.h(i)));
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar.instance).i);
        for (int i2 = 0; i2 < ((axge) fxgVar.instance).i.size(); i2++) {
            fxgVar.y(i2, qetVar.b(fxgVar.i(i2)));
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar.instance).j);
        for (int i3 = 0; i3 < ((axge) fxgVar.instance).j.size(); i3++) {
            fxgVar.z(i3, qetVar.b(fxgVar.j(i3)));
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar.instance).k);
        for (int i4 = 0; i4 < ((axge) fxgVar.instance).k.size(); i4++) {
            fxgVar.w(i4, qetVar.b(fxgVar.g(i4)));
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar.instance).l);
        for (int i5 = 0; i5 < ((axge) fxgVar.instance).l.size(); i5++) {
            fxgVar.v(i5, qetVar.b(fxgVar.f(i5)));
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar.instance).m);
        for (int i6 = 0; i6 < ((axge) fxgVar.instance).m.size(); i6++) {
            fxgVar.t(i6, qetVar.b(fxgVar.d(i6)));
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar.instance).o);
        for (int i7 = 0; i7 < ((axge) fxgVar.instance).o.size(); i7++) {
            fxgVar.u(i7, qetVar.b(fxgVar.e(i7)));
        }
    }

    public static qfa E(Long l, Long l2, HealthStats healthStats, Integer num, qep qepVar, int i) {
        Object obj;
        fxg fxgVar = (fxg) axge.a.createBuilder();
        long jS = s(healthStats, 10001);
        if (jS != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar = (axge) fxgVar.instance;
            axgeVar.b |= 1;
            axgeVar.d = jS;
        }
        long jS2 = s(healthStats, 10002);
        if (jS2 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar2 = (axge) fxgVar.instance;
            axgeVar2.b |= 2;
            axgeVar2.e = jS2;
        }
        long jS3 = s(healthStats, 10003);
        if (jS3 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar3 = (axge) fxgVar.instance;
            axgeVar3.b |= 4;
            axgeVar3.f = jS3;
        }
        long jS4 = s(healthStats, 10004);
        if (jS4 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar4 = (axge) fxgVar.instance;
            axgeVar4.b |= 8;
            axgeVar4.g = jS4;
        }
        fxgVar.q(t(healthStats, 10005));
        fxgVar.r(t(healthStats, 10006));
        fxgVar.s(t(healthStats, 10007));
        fxgVar.p(t(healthStats, 10008));
        fxgVar.o(t(healthStats, 10009));
        fxgVar.k(t(healthStats, 10010));
        axgd axgdVarW = w(healthStats, 10011);
        if (axgdVarW != null) {
            fxgVar.copyOnWrite();
            axge axgeVar5 = (axge) fxgVar.instance;
            axgeVar5.n = axgdVarW;
            axgeVar5.b |= 16;
        }
        fxgVar.l(t(healthStats, 10012));
        fxgVar.n(qew.a.e(u(healthStats, 10014)));
        fxgVar.m(qev.a.e(u(healthStats, 10015)));
        long jS5 = s(healthStats, 10016);
        if (jS5 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar6 = (axge) fxgVar.instance;
            axgeVar6.b |= 32;
            axgeVar6.s = jS5;
        }
        long jS6 = s(healthStats, 10017);
        if (jS6 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar7 = (axge) fxgVar.instance;
            axgeVar7.b |= 64;
            axgeVar7.t = jS6;
        }
        long jS7 = s(healthStats, 10018);
        if (jS7 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar8 = (axge) fxgVar.instance;
            axgeVar8.b |= SemanticState.Focused;
            axgeVar8.u = jS7;
        }
        long jS8 = s(healthStats, 10019);
        if (jS8 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar9 = (axge) fxgVar.instance;
            axgeVar9.b |= SemanticState.Hidden;
            axgeVar9.v = jS8;
        }
        long jS9 = s(healthStats, 10020);
        if (jS9 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar10 = (axge) fxgVar.instance;
            axgeVar10.b |= SemanticState.LiveRegion;
            axgeVar10.w = jS9;
        }
        long jS10 = s(healthStats, 10021);
        if (jS10 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar11 = (axge) fxgVar.instance;
            axgeVar11.b |= SemanticState.ReadOnly;
            axgeVar11.x = jS10;
        }
        long jS11 = s(healthStats, 10022);
        if (jS11 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar12 = (axge) fxgVar.instance;
            axgeVar12.b |= SemanticState.Modal;
            axgeVar12.y = jS11;
        }
        long jS12 = s(healthStats, 10023);
        if (jS12 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar13 = (axge) fxgVar.instance;
            axgeVar13.b |= SemanticState.Obscured;
            axgeVar13.z = jS12;
        }
        long jS13 = s(healthStats, 10024);
        if (jS13 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar14 = (axge) fxgVar.instance;
            axgeVar14.b |= SemanticState.Multiline;
            axgeVar14.A = jS13;
        }
        long jS14 = s(healthStats, 10025);
        if (jS14 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar15 = (axge) fxgVar.instance;
            axgeVar15.b |= 16384;
            axgeVar15.B = jS14;
        }
        long jS15 = s(healthStats, 10026);
        if (jS15 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar16 = (axge) fxgVar.instance;
            axgeVar16.b |= 32768;
            axgeVar16.C = jS15;
        }
        long jS16 = s(healthStats, 10027);
        if (jS16 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar17 = (axge) fxgVar.instance;
            axgeVar17.b |= 65536;
            axgeVar17.D = jS16;
        }
        long jS17 = s(healthStats, 10028);
        if (jS17 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar18 = (axge) fxgVar.instance;
            axgeVar18.b |= 131072;
            axgeVar18.E = jS17;
        }
        long jS18 = s(healthStats, 10029);
        if (jS18 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar19 = (axge) fxgVar.instance;
            axgeVar19.b |= 262144;
            axgeVar19.F = jS18;
        }
        axgd axgdVarW2 = w(healthStats, 10030);
        if (axgdVarW2 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar20 = (axge) fxgVar.instance;
            axgeVar20.G = axgdVarW2;
            axgeVar20.b |= 524288;
        }
        long jS19 = s(healthStats, 10031);
        if (jS19 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar21 = (axge) fxgVar.instance;
            axgeVar21.b |= 1048576;
            axgeVar21.H = jS19;
        }
        axgd axgdVarW3 = w(healthStats, 10032);
        if (axgdVarW3 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar22 = (axge) fxgVar.instance;
            axgeVar22.I = axgdVarW3;
            axgeVar22.b |= 2097152;
        }
        axgd axgdVarW4 = w(healthStats, 10033);
        if (axgdVarW4 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar23 = (axge) fxgVar.instance;
            axgeVar23.J = axgdVarW4;
            axgeVar23.b |= 4194304;
        }
        axgd axgdVarW5 = w(healthStats, 10034);
        if (axgdVarW5 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar24 = (axge) fxgVar.instance;
            axgeVar24.K = axgdVarW5;
            axgeVar24.b |= 8388608;
        }
        axgd axgdVarW6 = w(healthStats, 10035);
        if (axgdVarW6 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar25 = (axge) fxgVar.instance;
            axgeVar25.L = axgdVarW6;
            axgeVar25.b |= 16777216;
        }
        axgd axgdVarW7 = w(healthStats, 10036);
        if (axgdVarW7 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar26 = (axge) fxgVar.instance;
            axgeVar26.M = axgdVarW7;
            axgeVar26.b |= 33554432;
        }
        axgd axgdVarW8 = w(healthStats, 10037);
        if (axgdVarW8 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar27 = (axge) fxgVar.instance;
            axgeVar27.N = axgdVarW8;
            axgeVar27.b |= 67108864;
        }
        axgd axgdVarW9 = w(healthStats, 10038);
        if (axgdVarW9 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar28 = (axge) fxgVar.instance;
            axgeVar28.O = axgdVarW9;
            axgeVar28.b |= 134217728;
        }
        axgd axgdVarW10 = w(healthStats, 10039);
        if (axgdVarW10 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar29 = (axge) fxgVar.instance;
            axgeVar29.P = axgdVarW10;
            axgeVar29.b |= 268435456;
        }
        axgd axgdVarW11 = w(healthStats, 10040);
        if (axgdVarW11 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar30 = (axge) fxgVar.instance;
            axgeVar30.Q = axgdVarW11;
            axgeVar30.b |= 536870912;
        }
        axgd axgdVarW12 = w(healthStats, 10041);
        if (axgdVarW12 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar31 = (axge) fxgVar.instance;
            axgeVar31.R = axgdVarW12;
            axgeVar31.b |= 1073741824;
        }
        axgd axgdVarW13 = w(healthStats, 10042);
        if (axgdVarW13 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar32 = (axge) fxgVar.instance;
            axgeVar32.S = axgdVarW13;
            axgeVar32.b |= Integer.MIN_VALUE;
        }
        axgd axgdVarW14 = w(healthStats, 10043);
        if (axgdVarW14 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar33 = (axge) fxgVar.instance;
            axgeVar33.T = axgdVarW14;
            axgeVar33.c |= 1;
        }
        axgd axgdVarW15 = w(healthStats, 10044);
        if (axgdVarW15 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar34 = (axge) fxgVar.instance;
            axgeVar34.U = axgdVarW15;
            axgeVar34.c |= 2;
        }
        long jS20 = s(healthStats, 10045);
        if (jS20 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar35 = (axge) fxgVar.instance;
            axgeVar35.c |= 4;
            axgeVar35.V = jS20;
        }
        long jS21 = s(healthStats, 10046);
        if (jS21 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar36 = (axge) fxgVar.instance;
            axgeVar36.c |= 8;
            axgeVar36.W = jS21;
        }
        long jS22 = s(healthStats, 10047);
        if (jS22 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar37 = (axge) fxgVar.instance;
            axgeVar37.c |= 16;
            axgeVar37.X = jS22;
        }
        long jS23 = s(healthStats, 10048);
        if (jS23 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar38 = (axge) fxgVar.instance;
            axgeVar38.c |= 32;
            axgeVar38.Y = jS23;
        }
        long jS24 = s(healthStats, 10049);
        if (jS24 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar39 = (axge) fxgVar.instance;
            axgeVar39.c |= 64;
            axgeVar39.Z = jS24;
        }
        long jS25 = s(healthStats, 10050);
        if (jS25 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar40 = (axge) fxgVar.instance;
            axgeVar40.c |= SemanticState.Focused;
            axgeVar40.aa = jS25;
        }
        long jS26 = s(healthStats, 10051);
        if (jS26 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar41 = (axge) fxgVar.instance;
            axgeVar41.c |= SemanticState.Hidden;
            axgeVar41.ab = jS26;
        }
        long jS27 = s(healthStats, 10052);
        if (jS27 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar42 = (axge) fxgVar.instance;
            axgeVar42.c |= SemanticState.LiveRegion;
            axgeVar42.ac = jS27;
        }
        long jS28 = s(healthStats, 10053);
        if (jS28 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar43 = (axge) fxgVar.instance;
            axgeVar43.c |= SemanticState.ReadOnly;
            axgeVar43.ad = jS28;
        }
        long jS29 = s(healthStats, 10054);
        if (jS29 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar44 = (axge) fxgVar.instance;
            axgeVar44.c |= SemanticState.Modal;
            axgeVar44.ae = jS29;
        }
        long jS30 = s(healthStats, 10055);
        if (jS30 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar45 = (axge) fxgVar.instance;
            axgeVar45.c |= SemanticState.Obscured;
            axgeVar45.af = jS30;
        }
        long jS31 = s(healthStats, 10056);
        if (jS31 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar46 = (axge) fxgVar.instance;
            axgeVar46.c |= SemanticState.Multiline;
            axgeVar46.ag = jS31;
        }
        long jS32 = s(healthStats, 10057);
        if (jS32 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar47 = (axge) fxgVar.instance;
            axgeVar47.c |= 16384;
            axgeVar47.ah = jS32;
        }
        long jS33 = s(healthStats, 10058);
        if (jS33 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar48 = (axge) fxgVar.instance;
            axgeVar48.c |= 32768;
            axgeVar48.ai = jS33;
        }
        long jS34 = s(healthStats, 10059);
        if (jS34 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar49 = (axge) fxgVar.instance;
            axgeVar49.c |= 65536;
            axgeVar49.aj = jS34;
        }
        axgd axgdVarW16 = w(healthStats, 10061);
        if (axgdVarW16 != null) {
            fxgVar.copyOnWrite();
            axge axgeVar50 = (axge) fxgVar.instance;
            axgeVar50.ak = axgdVarW16;
            axgeVar50.c |= 131072;
        }
        long jS35 = s(healthStats, 10062);
        if (jS35 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar51 = (axge) fxgVar.instance;
            axgeVar51.c |= 262144;
            axgeVar51.al = jS35;
        }
        long jS36 = s(healthStats, 10063);
        if (jS36 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar52 = (axge) fxgVar.instance;
            axgeVar52.c |= 524288;
            axgeVar52.am = jS36;
        }
        long jS37 = s(healthStats, 10064);
        if (jS37 != 0) {
            fxgVar.copyOnWrite();
            axge axgeVar53 = (axge) fxgVar.instance;
            axgeVar53.c |= 1048576;
            axgeVar53.an = jS37;
        }
        fxg fxgVar2 = (fxg) ((axge) fxgVar.build()).toBuilder();
        DesugarCollections.unmodifiableList(((axge) fxgVar2.instance).h);
        int i2 = 0;
        while (true) {
            oml omlVar = qepVar.d;
            int size = ((axge) fxgVar2.instance).h.size();
            obj = omlVar.b;
            if (i2 >= size) {
                break;
            }
            fxgVar2.x(i2, ((qet) obj).c(1, fxgVar2.h(i2)));
            i2++;
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar2.instance).i);
        for (int i3 = 0; i3 < ((axge) fxgVar2.instance).i.size(); i3++) {
            fxgVar2.y(i3, ((qet) obj).c(1, fxgVar2.i(i3)));
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar2.instance).j);
        for (int i4 = 0; i4 < ((axge) fxgVar2.instance).j.size(); i4++) {
            fxgVar2.z(i4, ((qet) obj).c(1, fxgVar2.j(i4)));
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar2.instance).k);
        for (int i5 = 0; i5 < ((axge) fxgVar2.instance).k.size(); i5++) {
            fxgVar2.w(i5, ((qet) obj).c(1, fxgVar2.g(i5)));
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar2.instance).l);
        for (int i6 = 0; i6 < ((axge) fxgVar2.instance).l.size(); i6++) {
            fxgVar2.v(i6, ((qet) obj).c(2, fxgVar2.f(i6)));
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar2.instance).m);
        for (int i7 = 0; i7 < ((axge) fxgVar2.instance).m.size(); i7++) {
            fxgVar2.t(i7, ((qet) obj).c(3, fxgVar2.d(i7)));
        }
        DesugarCollections.unmodifiableList(((axge) fxgVar2.instance).o);
        for (int i8 = 0; i8 < ((axge) fxgVar2.instance).o.size(); i8++) {
            fxgVar2.u(i8, ((qet) obj).c(5, fxgVar2.e(i8)));
        }
        axge axgeVar54 = (axge) fxgVar2.build();
        String str = qepVar.b;
        return new qfa(axgeVar54, l, l2, -1L, Long.valueOf(str == null ? 0L : str.hashCode()), i, null, null, num);
    }

    public static boolean F(Context context) {
        return auyg.a.io().d(context);
    }

    public static qck G(awmd awmdVar, awmd awmdVar2) {
        if (!qpj.h(Thread.currentThread())) {
            qfe qfeVar = (qfe) awmdVar2.io();
            if (!qfe.b()) {
                agrc agrcVar = (agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedBackgroundInitialization", 29, "CrashOnBadPrimesConfiguration.java");
                Object obj = qfeVar.a;
                agrcVar.w("Primes init triggered from background in package: %s", obj);
                if (!qfeVar.a()) {
                    throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", obj));
                }
            }
        }
        return new qck((qcl) awmdVar.io());
    }

    public static /* synthetic */ pym H(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (pym) aihnVarBuild;
    }

    public static void I(String str, aihf aihfVar) {
        str.getClass();
        aihfVar.copyOnWrite();
        pym pymVar = (pym) aihfVar.instance;
        pym pymVar2 = pym.a;
        pymVar.k = str;
    }

    public static void J(String str, aihf aihfVar) {
        str.getClass();
        aihfVar.copyOnWrite();
        pym pymVar = (pym) aihfVar.instance;
        pym pymVar2 = pym.a;
        pymVar.j = str;
    }

    public static void K(boolean z, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pym pymVar = (pym) aihfVar.instance;
        pym pymVar2 = pym.a;
        pymVar.e = z;
    }

    public static void L(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pym pymVar = (pym) aihfVar.instance;
        pym pymVar2 = pym.a;
        pymVar.h = str;
    }

    public static void M(String str, aihf aihfVar) {
        str.getClass();
        aihfVar.copyOnWrite();
        pym pymVar = (pym) aihfVar.instance;
        pym pymVar2 = pym.a;
        pymVar.c = str;
    }

    public static void N(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pym pymVar = (pym) aihfVar.instance;
        pym pymVar2 = pym.a;
        pymVar.g = str;
    }

    public static void O(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pym pymVar = (pym) aihfVar.instance;
        pym pymVar2 = pym.a;
        pymVar.b = i;
    }

    public static void P(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pym pymVar = (pym) aihfVar.instance;
        pym pymVar2 = pym.a;
        pymVar.d = j;
    }

    public static void Q(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pym pymVar = (pym) aihfVar.instance;
        pym pymVar2 = pym.a;
        pymVar.f = V(i);
    }

    public static void R(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        pym pymVar = (pym) aihfVar.instance;
        pym pymVar2 = pym.a;
        pymVar.i = i == 1 ? aiif.a() : i - 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object S(hef hefVar, awoq awoqVar) throws Throwable {
        qag qagVar;
        if (awoqVar instanceof qag) {
            qagVar = (qag) awoqVar;
            int i = qagVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qagVar.b = i - Integer.MIN_VALUE;
            } else {
                qagVar = new qag(hefVar, awoqVar);
            }
        } else {
            qagVar = new qag(hefVar, awoqVar);
        }
        Object objAd = qagVar.a;
        awox awoxVar = awox.a;
        int i2 = qagVar.b;
        if (i2 == 0) {
            atqp.j(objAd);
            aher aherVar = new aher(agdf.a);
            qagVar.b = 1;
            objAd = awrc.ad(aherVar, qagVar);
            if (objAd == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objAd);
        }
        return ((agev) objAd).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object T(hef hefVar, awoq awoqVar) throws Throwable {
        qah qahVar;
        if (awoqVar instanceof qah) {
            qahVar = (qah) awoqVar;
            int i = qahVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qahVar.b = i - Integer.MIN_VALUE;
            } else {
                qahVar = new qah(hefVar, awoqVar);
            }
        } else {
            qahVar = new qah(hefVar, awoqVar);
        }
        Object objAd = qahVar.a;
        awox awoxVar = awox.a;
        int i2 = qahVar.b;
        if (i2 == 0) {
            atqp.j(objAd);
            aher aherVar = new aher(agdf.a);
            qahVar.b = 1;
            objAd = awrc.ad(aherVar, qahVar);
            if (objAd == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objAd);
        }
        return ((agev) objAd).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object U(hef hefVar, awoq awoqVar) throws Throwable {
        qai qaiVar;
        if (awoqVar instanceof qai) {
            qaiVar = (qai) awoqVar;
            int i = qaiVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qaiVar.b = i - Integer.MIN_VALUE;
            } else {
                qaiVar = new qai(hefVar, awoqVar);
            }
        } else {
            qaiVar = new qai(hefVar, awoqVar);
        }
        Object objAd = qaiVar.a;
        awox awoxVar = awox.a;
        int i2 = qaiVar.b;
        if (i2 == 0) {
            atqp.j(objAd);
            aher aherVar = new aher(agdf.a);
            qaiVar.b = 1;
            objAd = awrc.ad(aherVar, qaiVar);
            if (objAd == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objAd);
        }
        return ((agev) objAd).f();
    }

    public static int V(int i) {
        return i == 1 ? aiif.a() : i - 2;
    }

    public static /* synthetic */ Object W(pxu pxuVar, Map map, Map map2, awoq awoqVar) throws Throwable {
        zzu zzuVar;
        map.getClass();
        map2.getClass();
        Iterator it = map.entrySet().iterator();
        while (true) {
            zzuVar = ((hlc) pxuVar).a;
            if (!it.hasNext()) {
                break;
            }
            if (((pky) ((Map.Entry) it.next()).getValue()).i()) {
                zzuVar.c.aC(5);
            } else {
                zzuVar.c.aC(6);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            if (((pky) entry.getValue()).i()) {
                zzuVar.c.aC(7);
            } else {
                zzuVar.c.aC(8);
            }
            try {
                ((qbn) zzuVar.b.io()).b((pxk) entry.getKey());
            } catch (Exception e) {
                ((agrc) ((agrc) ((agrc) zzu.a.c()).j(e)).k("com/google/android/libraries/youtube/notification/chime/GnpRegistrationEventListener", "tryRemovingAllNotificationForUnregisteredAccount", '?', "GnpRegistrationEventListener.java")).t("Failed to remove all Chime notifications for unregistered account.");
            }
        }
        awmy awmyVar = awmy.a;
        Object objAd = awrc.ad(new aher(awmyVar), awoqVar);
        return objAd == awox.a ? objAd : awmyVar;
    }

    public static Map X(pxs pxsVar) {
        agkh agkhVar = new agkh(4);
        pxsVar.b(agkhVar);
        return agkhVar.d(true);
    }

    public static boolean Y(pxk pxkVar) {
        int iV = a.v(pxkVar);
        if (iV == 0 || iV == 1 || iV == 2) {
            return false;
        }
        if (iV == 3 || iV == 4) {
            return true;
        }
        throw new awmj();
    }

    public static void Z(aihf aihfVar, int i, boolean z) {
        if (((aiej) aihfVar.instance).b.size() <= 0) {
            if (!z) {
                return;
            }
            while (((aiej) aihfVar.instance).b.size() <= 0) {
                aihfVar.copyOnWrite();
                aiej aiejVar = (aiej) aihfVar.instance;
                aiejVar.a();
                aiejVar.b.g(0L);
            }
        }
        long jA = ((aiej) aihfVar.instance).b.a(0);
        long j = 1 << i;
        long j2 = z ? jA | j : jA & (~j);
        aihfVar.copyOnWrite();
        aiej aiejVar2 = (aiej) aihfVar.instance;
        aiejVar2.a();
        aiejVar2.b.d(0, j2);
    }

    public static Object aA(pky pkyVar) {
        if (pkyVar instanceof pla) {
            return ((pla) pkyVar).a;
        }
        return null;
    }

    public static String aB(pky pkyVar) {
        int iC = a.C(pkyVar);
        if (iC == 0) {
            return "SUCCESS";
        }
        if (iC == 1) {
            return "TRANSIENT_FAILURE";
        }
        if (iC == 2) {
            return "PERMANENT_FAILURE";
        }
        throw new awmj();
    }

    public static Throwable aC(pky pkyVar) {
        int iD = a.D(pkyVar);
        if (iD == 0) {
            return null;
        }
        if (iD == 1) {
            return ((pku) pkyVar).b();
        }
        throw new awmj();
    }

    public static int aD(aidy aidyVar) {
        int iOrdinal = aidyVar.ordinal();
        if (iOrdinal == 1) {
            return 7;
        }
        int i = 2;
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return 4;
            }
            i = 5;
            if (iOrdinal != 5) {
                return iOrdinal == 8 ? 6 : 1;
            }
        }
        return i;
    }

    public static /* synthetic */ TextPaint aE(Context context) {
        Typeface typefaceCreate;
        String string;
        ColorStateList colorStateList;
        TextPaint textPaint = new TextPaint(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(owk.b);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(resourceId, owk.a);
        if (typedArrayObtainStyledAttributes2.hasValue(3)) {
            ColorStateList colorStateList2 = typedArrayObtainStyledAttributes2.getColorStateList(3);
            if (colorStateList2 != null) {
                textPaint.setColor(colorStateList2.getDefaultColor());
            }
        } else {
            ColorStateList.valueOf(-16777216);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(5) && (colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(5)) != null) {
            textPaint.linkColor = colorStateList.getDefaultColor();
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            textPaint.setTextSize(typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 15));
        } else {
            textPaint.setTextSize(15.0f);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(10)) {
            try {
                typefaceCreate = typedArrayObtainStyledAttributes2.getFont(10);
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                typefaceCreate = null;
            }
            if (typefaceCreate == null && (string = typedArrayObtainStyledAttributes2.getString(10)) != null) {
                typefaceCreate = Typeface.create(string, 0);
            }
            if (typefaceCreate != null) {
                textPaint.setTypeface(typefaceCreate);
            }
        } else if (typedArrayObtainStyledAttributes2.hasValue(1)) {
            int i = typedArrayObtainStyledAttributes2.getInt(1, -1);
            if (i == 1) {
                textPaint.setTypeface(Typeface.SANS_SERIF);
            } else if (i == 2) {
                textPaint.setTypeface(Typeface.SERIF);
            } else if (i == 3) {
                textPaint.setTypeface(Typeface.MONOSPACE);
            }
        }
        typedArrayObtainStyledAttributes2.recycle();
        return textPaint;
    }

    public static boolean aF(aigm aigmVar) {
        int iN;
        while (!aigmVar.D() && (iN = aigmVar.n()) != 0) {
            try {
                if ((iN >>> 3) == 15) {
                    if ((iN & 7) == 0) {
                        return aigmVar.E();
                    }
                    throw new IllegalArgumentException("Element proto passed in to RenderNextEnablementCheck has a non-varint wire typefor the enable_rendernext field (15)! Are you passing in a valid Element proto?");
                }
                aigmVar.F(iN);
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to read Element proto passed in to RenderNextEnablementCheck: ", e);
            }
        }
        return false;
    }

    public static aga aG(Set set) {
        aga agaVar = new aga((set != null ? 1 : 0) + 3);
        agaVar.d(atcw.d.a, new orn(0));
        agaVar.d(atbf.d.a, new orn(1));
        agaVar.d(atgq.d.a, new orn(2));
        if (set != null) {
            agqr it = ((agqj) set).iterator();
            while (it.hasNext()) {
                opj opjVar = (opj) it.next();
                agaVar.d(opjVar.a().a, opjVar);
            }
        }
        return agaVar;
    }

    public static oow aH(agfr agfrVar, agfr agfrVar2, ExecutorService executorService, Context context, osd osdVar, orq orqVar) {
        qnl qnlVar = new qnl();
        qnl qnlVar2 = new qnl();
        qnl qnlVar3 = new qnl();
        qnl qnlVar4 = new qnl();
        aga agaVar = ElementsServices.a;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        oow oowVar = new oow();
        oowVar.D = qnlVar;
        oowVar.A = qnlVar2;
        oowVar.C = qnlVar3;
        oowVar.B = qnlVar4;
        oowVar.d = agfrVar;
        oowVar.e = agfrVar2;
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        oowVar.b = context;
        if (displayMetrics == null) {
            throw new NullPointerException("Null displayMetrics");
        }
        oowVar.f = displayMetrics;
        if (resources == null) {
            throw new NullPointerException("Null resources");
        }
        oowVar.g = resources;
        if (executorService == null) {
            throw new NullPointerException("Null backgroundExecutorService");
        }
        oowVar.a = executorService;
        if (orqVar == null) {
            throw new NullPointerException("Null commandResolver");
        }
        oowVar.j = orqVar;
        oowVar.i = osdVar;
        aga agaVar2 = ElementsServices.a;
        oowVar.x = new qpu(agaVar2);
        oowVar.f(agaVar2);
        oowVar.d(agaVar2);
        oowVar.c = displayMetrics.density;
        oowVar.v = (byte) (oowVar.v | 1);
        oowVar.h = resources.getConfiguration().getLayoutDirection();
        oowVar.v = (byte) (oowVar.v | 2);
        oowVar.e(oui.b);
        oowVar.k = new RealClock();
        agfr agfrVarAl = aguu.al(new cbr(context, 19));
        if (agfrVarAl == null) {
            throw new NullPointerException("Null textPaint");
        }
        oowVar.l = agfrVarAl;
        oowVar.m = nrr.e;
        oowVar.s = aguu.al(new jxp(10));
        nxx nxxVarA = nxx.a();
        nxxVarA.t();
        nxxVarA.x(true);
        nxxVarA.u(false);
        nxxVarA.v(true);
        nxxVarA.h(1);
        oowVar.c(nxxVarA.b());
        return oowVar;
    }

    public static aga aI(Context context, owu owuVar, oxn oxnVar, oui ouiVar, kjc kjcVar, Set set, syn synVar, mew mewVar) {
        aga agaVar = new aga((set != null ? set.size() : 0) + 9);
        agaVar.d(aten.d.a, new oyd(1));
        agaVar.d(atal.d.a, new oyd(0));
        agaVar.d(TextTypeOuterClass$TextType.d.a, new oxf(owuVar, oxnVar));
        agaVar.d(atjc.d.a, new ouc(context, ouiVar, kjcVar, 0));
        int i = oqu.t;
        agaVar.d(atbv.d.a, new oqn(context, synVar, orb.a));
        if (Memory.peekByte(mewVar.c + 50) != 0) {
            agaVar.d(atlz.d.a, new ovu());
        } else {
            agaVar.d(atlz.d.a, new owd(context, owuVar, oxnVar));
        }
        int i2 = osc.b;
        agaVar.d(atfx.d.a, new orz(context, owuVar));
        agaVar.d(atmu.d.a, new owg());
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                opm opmVar = (opm) it.next();
                agaVar.d(opmVar.b().a, opmVar);
            }
        }
        return agaVar;
    }

    public static kjc aJ(Iterable iterable) {
        return new kjc(new ahek(false, agke.j(iterable)));
    }

    @SafeVarargs
    public static kjc aK(ListenableFuture... listenableFutureArr) {
        return new kjc(ahng.j(listenableFutureArr));
    }

    public static SharedPreferences aL(Context context, String str, agev agevVar) {
        return context.getSharedPreferences(aO(str, agevVar), 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public static MessageLite aM(String str, aiix aiixVar) throws aiik {
        try {
            return aiixVar.h(Base64.decode(str, 3), ExtensionRegistryLite.a);
        } catch (IllegalArgumentException e) {
            throw new aiik("Unable to decode to byte array", new IOException(e));
        }
    }

    public static MessageLite aN(SharedPreferences sharedPreferences, String str, aiix aiixVar) {
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return aM(string, aiixVar);
        } catch (aiik unused) {
            return null;
        }
    }

    public static String aO(String str, agev agevVar) {
        return (agevVar == null || !agevVar.g()) ? str : str.concat((String) agevVar.c());
    }

    public static String aP(MessageLite messageLite) {
        return Base64.encodeToString(messageLite.toByteArray(), 3);
    }

    public static void aQ(SharedPreferences.Editor editor, String str, MessageLite messageLite) {
        editor.putString(str, aP(messageLite));
    }

    public static boolean aR(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    public static boolean aS(SharedPreferences sharedPreferences, String str, MessageLite messageLite) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        aQ(editorEdit, str, messageLite);
        return editorEdit.commit();
    }

    public static ByteBuffer aT(Iterable iterable) {
        String str;
        Iterator it = iterable.iterator();
        long serializedSize = 0;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            serializedSize += (long) (((MessageLite) it.next()).getSerializedSize() + 12);
            i2++;
        }
        if (i2 == 0) {
            return ByteBuffer.allocate(0);
        }
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) serializedSize);
            byte[] bArrArray = byteBufferAllocate.array();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                MessageLite messageLite = (MessageLite) it2.next();
                int serializedSize2 = messageLite.getSerializedSize();
                try {
                    byteBufferAllocate.putInt(serializedSize2);
                    int i3 = i + 4;
                    try {
                        messageLite.writeTo(new aigo(bArrArray, i3, serializedSize2, null));
                    } catch (IOException e) {
                        Log.e("ProtoLiteUtil", "Exception while writing to buffer.", e);
                    }
                    try {
                        byteBufferAllocate.put(bArrArray, i3, serializedSize2);
                        int i4 = i3 + serializedSize2;
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArrArray, i4 - serializedSize2, serializedSize2);
                        byteBufferAllocate.putLong(crc32.getValue());
                        i = i4 + 8;
                    } catch (BufferOverflowException e2) {
                        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", e2);
                        return null;
                    }
                } catch (BufferOverflowException e3) {
                    Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", e3);
                    return null;
                }
            }
            byteBufferAllocate.rewind();
            return byteBufferAllocate;
        } catch (IllegalArgumentException e4) {
            if (serializedSize > 1073741824) {
                str = String.format(Locale.US, "%.2fGB", Double.valueOf(serializedSize / 1.073741824E9d));
            } else if (serializedSize > 1048576) {
                str = String.format(Locale.US, "%.2fMB", Double.valueOf(serializedSize / 1048576.0d));
            } else {
                str = serializedSize > 1024 ? String.format(Locale.US, "%.2fKB", Double.valueOf(serializedSize / 1024.0d)) : String.format(Locale.US, "%d Bytes", Long.valueOf(serializedSize));
            }
            Log.e("ProtoLiteUtil", String.format("Too big to serialize, %s", str), e4);
            return null;
        }
    }

    public static List aU(ByteBuffer byteBuffer, Class cls, aiix aiixVar) {
        Object objI;
        String string = cls.toString();
        int iLimit = byteBuffer.limit();
        ArrayList arrayList = new ArrayList((byteBuffer.limit() / 1000) + 1);
        while (byteBuffer.position() < iLimit) {
            try {
                int i = byteBuffer.getInt();
                if (i < 0) {
                    Log.e("ProtoLiteUtil", String.format("Invalid message size: %d. May have given the wrong message type: %s", Integer.valueOf(i), string));
                } else {
                    if (iLimit < byteBuffer.position() + i + 8) {
                        Log.e("ProtoLiteUtil", String.format("Invalid message size: %d (buffer end is %d)", Integer.valueOf(i), Integer.valueOf(iLimit)));
                        return arrayList;
                    }
                    long j = byteBuffer.getLong(byteBuffer.position() + i);
                    byte[] bArrArray = byteBuffer.array();
                    int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArrArray, iArrayOffset, i);
                    long value = crc32.getValue();
                    if (value != j) {
                        Log.e("ProtoLiteUtil", String.format("Corrupt protobuf data, expected CRC: %d computed CRC: %d", Long.valueOf(j), Long.valueOf(value)));
                        return arrayList;
                    }
                    try {
                        objI = aiixVar.i(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i, ExtensionRegistryLite.a);
                    } catch (aiik e) {
                        Log.e("ProtoLiteUtil", "Cannot deserialize message of type ".concat(cls.toString()), e);
                        objI = null;
                    }
                    if (objI != null) {
                        arrayList.add(objI);
                        byteBuffer.position(byteBuffer.position() + i + 8);
                    }
                }
            } catch (BufferUnderflowException e2) {
                Log.e("ProtoLiteUtil", String.format("Buffer underflow. May have given the wrong message type: %s", string), e2);
            }
            return null;
        }
        return arrayList;
    }

    public static qrh aV(Context context, ahex ahexVar, ong ongVar, omj omjVar, agev agevVar) {
        qrn qrnVar = new qrn(context.getApplicationContext(), ahexVar);
        qrnVar.c = aO("gms_icing_mdd_groups", agevVar);
        qrnVar.c();
        qrnVar.f = new cbr(omjVar, 18);
        qrnVar.e(new onw(ongVar, 1));
        return qrnVar.a();
    }

    public static qrh aW(Context context, ahex ahexVar, ong ongVar, omj omjVar, agev agevVar) {
        qrn qrnVar = new qrn(context.getApplicationContext(), ahexVar);
        qrnVar.c = aO("gms_icing_mdd_shared_files", agevVar);
        qrnVar.c();
        qrnVar.f = new cbr(omjVar, 18);
        qrnVar.e(new onw(ongVar, 0));
        return qrnVar.a();
    }

    public static oiw aX(String str) throws onv {
        try {
            oiw oiwVar = oiw.a;
            return (oiw) aM(str, aihn.getParserForClass(oiw.class));
        } catch (aiik | NullPointerException e) {
            throw new onv("Failed to deserialize key:".concat(String.valueOf(str)), e);
        }
    }

    public static File aY(Context context, agev agevVar) {
        String strConcat = "gms_icing_mdd_garbage_file";
        if (agevVar != null && agevVar.g()) {
            strConcat = "gms_icing_mdd_garbage_file".concat((String) agevVar.c());
        }
        return new File(context.getFilesDir(), strConcat);
    }

    public static String aZ(oiw oiwVar) {
        return Base64.encodeToString(oiwVar.toByteArray(), 3);
    }

    public static boolean aa(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    public static boolean ab(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 26;
    }

    public static boolean ac(Context context) {
        return a.aO() && context.getApplicationInfo().targetSdkVersion >= 31;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    public static pwk ad(Context context) {
        if (context.getPackageManager().hasSystemFeature("org.chromium.arc")) {
            return pwk.f;
        }
        if (context.getPackageManager().hasSystemFeature("android.software.xr.api.spatial")) {
            return pwk.h;
        }
        if (a.aN() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
            return pwk.e;
        }
        if (context.getPackageManager().hasSystemFeature("com.google.android.tv") || context.getPackageManager().hasSystemFeature("android.hardware.type.television") || context.getPackageManager().hasSystemFeature("android.software.leanback")) {
            return pwk.b;
        }
        if (ae(context)) {
            return pwk.d;
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return pwk.c;
        }
        if (context.getPackageManager().hasSystemFeature("com.google.desktop.gms")) {
            return pwk.g;
        }
        int i = awk.a;
        if (Build.VERSION.SDK_INT >= 36) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.type.xr_peripheral")) {
                return pwk.i;
            }
        } else if (Build.VERSION.SDK_INT >= 35) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (awk.a("Baklava", str)) {
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.xr_peripheral")) {
                    return pwk.i;
                }
            }
        }
        return pwk.a;
    }

    public static boolean ae(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean af(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Long ag(Context context) {
        try {
            long jC = lsx.c(context.getContentResolver(), -1L);
            Long lValueOf = jC == -1 ? null : Long.valueOf(jC);
            if (lValueOf == null) {
                ((agsj) pvc.a.c()).t("Failed to get android ID.");
            }
            return lValueOf;
        } catch (SecurityException e) {
            ((agsj) ((agsj) pvc.a.b()).j(e)).t("Exception reading GServices key - ANDROID_ID.");
            return null;
        }
    }

    public static Long ah(Context context) {
        try {
            Object systemService = context.getSystemService("user");
            systemService.getClass();
            long serialNumberForUser = ((UserManager) systemService).getSerialNumberForUser(Process.myUserHandle());
            if (serialNumberForUser != -1) {
                return Long.valueOf(serialNumberForUser);
            }
            return null;
        } catch (Exception e) {
            ((agsj) ((agsj) pvc.a.c()).j(e)).t("Exception reading getSerialNumberForUser.");
            return null;
        }
    }

    public static int ai(ptj ptjVar) {
        ptjVar.getClass();
        return ptjVar.d;
    }

    public static agkz aj(String str) {
        pya pyaVar;
        str.getClass();
        List listF = awrc.F(str, new String[]{","});
        ArrayList arrayList = new ArrayList(atqq.N(listF, 10));
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            int i = Integer.parseInt((String) it.next());
            pya[] pyaVarArrValues = pya.values();
            int length = pyaVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    pyaVar = null;
                    break;
                }
                pyaVar = pyaVarArrValues[i2];
                if (pyaVar.c == i) {
                    break;
                }
                i2++;
            }
            if (pyaVar == null) {
                throw new IllegalArgumentException(a.bP(i, "Notification channel ", " is not supported."));
            }
            arrayList.add(pyaVar);
        }
        agkz agkzVarN = agkz.n(arrayList);
        agkzVarN.getClass();
        return agkzVarN;
    }

    public static String ak(agkz agkzVar) {
        agkzVar.getClass();
        ArrayList arrayList = new ArrayList(atqq.N(agkzVar, 10));
        Iterator<E> it = agkzVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((pya) it.next()).c));
        }
        return atqq.aD(arrayList, ",", null, null, null, 62);
    }

    public static int al(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static int am(int i) {
        int[] iArrAv = av();
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int i4 = iArrAv[i3];
            if (i4 == 0) {
                throw null;
            }
            if (i4 == i) {
                i2 = i4;
                break;
            }
        }
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException(a.bP(i, "Account type ", " is not supported."));
    }

    public static int an(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static int ao(aiaz aiazVar, List list, Map map) {
        list.getClass();
        map.getClass();
        int iIntValue = 0;
        if (aiazVar != null) {
            aihf builder = aiazVar.toBuilder();
            builder.getClass();
            ahud ahudVar = new ahud(builder, (byte[]) null);
            aihf aihfVar = (aihf) ahudVar.b;
            aihfVar.copyOnWrite();
            aiaz aiazVar2 = (aiaz) aihfVar.instance;
            aiazVar2.b &= -5;
            aiazVar2.e = 0;
            aihfVar.copyOnWrite();
            aiaz aiazVar3 = (aiaz) aihfVar.instance;
            aiazVar3.b &= -17;
            aiazVar3.h = aiaz.a.h;
            aikl aiklVarG = ahudVar.g();
            ArrayList arrayList = new ArrayList(atqq.N(aiklVarG, 10));
            Iterator<E> it = aiklVarG.iterator();
            while (it.hasNext()) {
                aihf builder2 = ((aiay) it.next()).toBuilder();
                builder2.getClass();
                ahud ahudVar2 = new ahud(builder2, (byte[]) null);
                aihf aihfVar2 = (aihf) ahudVar2.b;
                aihfVar2.copyOnWrite();
                aiay aiayVar = (aiay) aihfVar2.instance;
                aiayVar.b &= -2;
                aiay aiayVar2 = aiay.a;
                aiayVar.c = aiayVar2.c;
                aihfVar2.copyOnWrite();
                aiay aiayVar3 = (aiay) aihfVar2.instance;
                aiayVar3.d = null;
                aiayVar3.b &= -3;
                aihfVar2.copyOnWrite();
                aiay aiayVar4 = (aiay) aihfVar2.instance;
                aiayVar4.b &= -17;
                aiayVar4.h = aiayVar2.h;
                arrayList.add(ahudVar2.O());
            }
            List listAm = atqq.am(arrayList, new cru(8));
            ahudVar.g();
            ahudVar.i();
            ahudVar.g();
            ahudVar.h(listAm);
            int iHashCode = ahudVar.f().hashCode();
            ArrayList arrayList2 = new ArrayList(atqq.N(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((pxk) it2.next()).a().hashCode()));
            }
            Iterator it3 = atqq.al(arrayList2).iterator();
            while (it3.hasNext()) {
                iHashCode = (iHashCode * 53) + ((Number) it3.next()).intValue();
            }
            ArrayList<pxl> arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof pxl) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(atqq.N(arrayList3, 10));
            for (pxl pxlVar : arrayList3) {
                int iHashCode2 = pxlVar.a.hashCode() * 53;
                plx plxVar = (plx) map.get(pxlVar);
                String str = plxVar != null ? plxVar.d : null;
                arrayList4.add(Integer.valueOf(iHashCode2 + (str != null ? str.hashCode() : 0)));
            }
            Iterator it4 = atqq.al(arrayList4).iterator();
            iIntValue = iHashCode;
            while (it4.hasNext()) {
                iIntValue = (iIntValue * 53) + ((Number) it4.next()).intValue();
            }
        }
        return iIntValue;
    }

    public static omm ap(agev agevVar, plv plvVar, awmd awmdVar) {
        plvVar.getClass();
        if (plvVar.a()) {
            if (((Boolean) awmdVar.io()).booleanValue()) {
                throw new IllegalStateException("GnpRegistrationDataProvider must be provided for unified registrations");
            }
            return (omm) ((agfa) agevVar).a;
        }
        if (plvVar.b()) {
            throw new IllegalStateException("GnpRegistrationDataProvider must be provided for fetch-only registrations");
        }
        throw new IllegalStateException("Unsupported targetType for RegistrationDataProviderHelper");
    }

    public static pqo aq(pxs pxsVar) {
        pxsVar.getClass();
        Objects.checkIndex(0, 8);
        if (pxsVar instanceof pxw) {
            return pqo.SIGNED_IN;
        }
        if ((pxsVar instanceof pxz) || (pxsVar instanceof pxy)) {
            return pqo.SIGNED_OUT_ZWIEBACK;
        }
        if (pxsVar instanceof pxx) {
            return pqo.SIGNED_OUT_YOUTUBE_VISITOR;
        }
        if (pxsVar instanceof pxq) {
            return pqo.SIGNED_IN_FITBIT;
        }
        if ((pxsVar instanceof pxp) || (pxsVar instanceof pxt)) {
            return pqo.UNKNOWN;
        }
        throw new awmj();
    }

    public static String ar(plx plxVar, int i, String str) {
        String strValueOf;
        if (plxVar == null || (strValueOf = String.valueOf(plxVar.a)) == null) {
            strValueOf = "no_account";
        }
        if (str == null) {
            return a.cg(i, strValueOf, "GNP_SDK_JOB::", "::");
        }
        return "GNP_SDK_JOB::" + strValueOf + "::" + i + "::" + str;
    }

    public static int as(int i) {
        return 2;
    }

    public static boolean at(Context context, pxh pxhVar, pls plsVar) {
        context.getClass();
        pxhVar.getClass();
        plsVar.getClass();
        pxhVar.a(context);
        return auvj.a.io().g() && plsVar.k;
    }

    public static /* synthetic */ String au(int i) {
        if (i == 1) {
            return "GAIA";
        }
        if (i == 2) {
            return "ZWIEBACK";
        }
        if (i == 3) {
            return "YOUTUBE_VISITOR";
        }
        if (i != 4) {
            return i != 5 ? "null" : "FITBIT";
        }
        return "DELEGATED_GAIA";
    }

    public static int[] av() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static int aw(pxk pxkVar) {
        pxkVar.getClass();
        Objects.checkIndex(0, 6);
        if (pxkVar instanceof pxo) {
            return 1;
        }
        if (pxkVar instanceof pyd) {
            return 2;
        }
        if (pxkVar instanceof pyb) {
            return 3;
        }
        if (pxkVar instanceof pxl) {
            return 4;
        }
        if (pxkVar instanceof pxn) {
            return 5;
        }
        throw new awmj();
    }

    public static pky ax(pky pkyVar) {
        pkyVar.getClass();
        return ay(pkyVar, new prq(1));
    }

    public static pky ay(pky pkyVar, awqg awqgVar) {
        pkyVar.getClass();
        int iD = a.D(pkyVar);
        if (iD == 0) {
            return new pla(awqgVar.invoke(((pla) pkyVar).a));
        }
        if (iD != 1) {
            throw new awmj();
        }
        return pkyVar;
    }

    public static pkx az(pky pkyVar) {
        int iD = a.D(pkyVar);
        if (iD == 0) {
            return null;
        }
        if (iD == 1) {
            return ((pku) pkyVar).a();
        }
        throw new awmj();
    }

    private static int b(int[] iArr, int i) {
        int iF = rpi.f(iArr, i);
        return iF >= 0 ? iF + 1 : (-iF) - 1;
    }

    public static int bA(nci nciVar) {
        int iBB = bB(nciVar);
        if (iBB != 0) {
            return iBB;
        }
        myh myhVarBD = bD(nciVar);
        if (myhVarBD == null || !myhVarBD.t()) {
            return 0;
        }
        return myhVarBD.m().X();
    }

    static int bB(nci nciVar) {
        if (nciVar.g() == 0 || !nciVar.i(0).m() || nciVar.i(0).i().g() == 0) {
            return 0;
        }
        return nciVar.i(0).i().g();
    }

    public static Uri bC(String str) {
        Uri uri = Uri.parse(str);
        return ahno.aa(uri.getScheme()) ? uri.buildUpon().scheme("https").build() : uri;
    }

    public static myh bD(nci nciVar) {
        if (nciVar.m()) {
            nck nckVarH = nciVar.h();
            mep mepVar = myh.D;
            if (nckVarH.e(mepVar)) {
                return (myh) nckVarH.d(mepVar);
            }
        }
        return null;
    }

    static nqn bE(esq esqVar, Context context, nci nciVar, boolean z) {
        int iC;
        int iBA;
        ncl nclVarE = npy.e(nciVar);
        if (nclVarE == null || (iC = npy.c(context, nclVarE)) == 0) {
            return null;
        }
        if (z && (iBA = bA(nciVar)) != 0 && npy.f(context, nciVar)) {
            try {
                Drawable drawable = context.getDrawable(iC);
                if (drawable != null) {
                    drawable.mutate().setTint(iBA);
                    if (context != null) {
                        return new nqn(erj.b(context).c.a(context).d(drawable), nclVarE);
                    }
                    throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
        return new nqn(esqVar.e(Integer.valueOf(iC)), nclVarE);
    }

    public static void bF(VectorDrawable vectorDrawable, myk mykVar) {
        int iX = mykVar.X();
        ColorFilter porterDuffColorFilter = null;
        if (Build.VERSION.SDK_INT >= 29) {
            Object objK = aup.k(6);
            if (objK != null) {
                porterDuffColorFilter = new BlendModeColorFilter(iX, gb$$ExternalSyntheticApiModelOutline0.m(objK));
            }
        } else {
            PorterDuff.Mode modeE = auq.e(6);
            if (modeE != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(iX, modeE);
            }
        }
        if (porterDuffColorFilter != null) {
            vectorDrawable.setColorFilter(porterDuffColorFilter);
        }
    }

    public static boolean bG(Context context) {
        Context baseContext;
        if (context instanceof Activity) {
            return ((Activity) context).isDestroyed();
        }
        return (context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null && bG(baseContext);
    }

    public static void bH(Drawable drawable, nci nciVar) {
        int iBB = bB(nciVar);
        if (iBB != 0) {
            drawable.mutate().setColorFilter(iBB, PorterDuff.Mode.SRC_IN);
        }
    }

    public static ImageView.ScaleType bI(int i, boolean z, boolean z2, int i2) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return z ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_INSIDE;
            }
            if (i3 == 3) {
                return ImageView.ScaleType.CENTER_CROP;
            }
            if (i3 == 4) {
                return ImageView.ScaleType.CENTER;
            }
        } else if (z2 && i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArrValues = ImageView.ScaleType.values();
            if (i2 < scaleTypeArrValues.length) {
                return scaleTypeArrValues[i2];
            }
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static int bJ(int i, axh axhVar, CharSequence charSequence, fwl fwlVar) {
        int i2 = i - 1;
        if (i2 == 3) {
            if ((fwlVar == fwl.RTL) == axhVar.a(charSequence, 0, charSequence.length())) {
                return 2;
            }
        } else if (i2 == 4) {
            if ((fwlVar == fwl.RTL) != axhVar.a(charSequence, 0, charSequence.length())) {
                return 2;
            }
        } else if (i2 != 5) {
            if (i2 != 6) {
                return 4;
            }
            if (axhVar.a(charSequence, 0, charSequence.length())) {
                return 2;
            }
        } else if (!axhVar.a(charSequence, 0, charSequence.length())) {
            return 2;
        }
        return 3;
    }

    public static int bK(mxc mxcVar) {
        int iG = mxcVar.G() - 1;
        if (iG == 1) {
            return 6;
        }
        if (iG != 2) {
            return iG != 3 ? 4 : 3;
        }
        return 7;
    }

    public static Map bL(agev agevVar) {
        agkh agkhVar = new agkh(4);
        agqr it = ((agpk) ((agpn) ((agfa) agevVar).a).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            agkhVar.e(Integer.valueOf(((nws) ((Pair) entry.getValue()).first).a().a()), (Pair) entry.getValue());
        }
        return agkhVar.d(true);
    }

    public static tke bM(int i, int i2, int[] iArr, boolean z) {
        int i3;
        int iB;
        int i4 = i + i2;
        int i5 = i4 - 1;
        if (!z) {
            i4 = i5;
        }
        if (z && i == 0) {
            iB = 0;
            i3 = 0;
        } else {
            i3 = i;
            iB = b(iArr, i);
        }
        if (i2 > 0) {
            i2 += b(iArr, i4) - iB;
        }
        return new tke(i3 + iB, i2);
    }

    public static nxs bN(ncq ncqVar, omj omjVar, nsl nslVar, nry nryVar) {
        nci nciVarM = ncqVar.m();
        if (nciVarM.n() != 5 && nciVarM.n() != 4 && nciVarM.n() != 6) {
            return null;
        }
        omj omjVarB = ncqVar.t() ? omjVar.B(ncqVar.j(), nslVar) : null;
        omj omjVarB2 = ncqVar.s() ? omjVar.B(ncqVar.i(), nslVar) : null;
        return new nxs(omjVarB != null ? omjVarB.x() : null, omjVarB2 != null ? omjVarB2.x() : null, nryVar, ncqVar);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0244  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4 A[Catch: aiik -> 0x0141, TryCatch #0 {aiik -> 0x0141, blocks: (B:16:0x0049, B:18:0x006a, B:20:0x006e, B:22:0x0072, B:24:0x0076, B:26:0x007a, B:28:0x0080, B:30:0x0088, B:32:0x008c, B:36:0x0097, B:38:0x009c, B:40:0x00a0, B:41:0x00a2, B:43:0x00bb, B:45:0x00cb, B:47:0x00d0, B:59:0x0114, B:48:0x00d7, B:50:0x00dd, B:51:0x00e4, B:53:0x00fa, B:54:0x0104, B:57:0x010e), top: B:170:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa A[Catch: aiik -> 0x0141, TryCatch #0 {aiik -> 0x0141, blocks: (B:16:0x0049, B:18:0x006a, B:20:0x006e, B:22:0x0072, B:24:0x0076, B:26:0x007a, B:28:0x0080, B:30:0x0088, B:32:0x008c, B:36:0x0097, B:38:0x009c, B:40:0x00a0, B:41:0x00a2, B:43:0x00bb, B:45:0x00cb, B:47:0x00d0, B:59:0x0114, B:48:0x00d7, B:50:0x00dd, B:51:0x00e4, B:53:0x00fa, B:54:0x0104, B:57:0x010e), top: B:170:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0104 A[Catch: aiik -> 0x0141, TryCatch #0 {aiik -> 0x0141, blocks: (B:16:0x0049, B:18:0x006a, B:20:0x006e, B:22:0x0072, B:24:0x0076, B:26:0x007a, B:28:0x0080, B:30:0x0088, B:32:0x008c, B:36:0x0097, B:38:0x009c, B:40:0x00a0, B:41:0x00a2, B:43:0x00bb, B:45:0x00cb, B:47:0x00d0, B:59:0x0114, B:48:0x00d7, B:50:0x00dd, B:51:0x00e4, B:53:0x00fa, B:54:0x0104, B:57:0x010e), top: B:170:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v24, types: [adxj, java.lang.Object] */
    public static nqn bO(esq esqVar, Context context, nci nciVar, nci nciVar2, nci nciVar3, omj omjVar, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        nqn nqnVar;
        int i5;
        int i6;
        nqn nqnVar2;
        ncl nclVar;
        akcr akcrVar;
        arqz arqzVarA;
        aihl aihlVar;
        aihl aihlVarCheckIsLite;
        int iAu;
        Integer numQ;
        if (bG(context)) {
            return null;
        }
        int iBA = z2 ? bA(nciVar) : 0;
        int iG = nciVar.g();
        int i7 = 0;
        while (true) {
            if (i7 >= iG) {
                i3 = 0;
                i4 = 1;
                nqnVar = null;
                break;
            }
            ncl nclVarI = nciVar.i(i7);
            nch nchVarJ = nclVarI.j();
            if (nchVarJ != null) {
                int[] iArrAG = ksy.aG(nchVarJ);
                i3 = 0;
                if (iArrAG.length == 0) {
                    throw new nud("Failed to extract a custom image source extension from image. Make sure custom image source array is not empty in eml.");
                }
                int i8 = iArrAG[0];
                i4 = 1;
                vwt vwtVar = (vwt) omjVar.a.get(Integer.valueOf(i8));
                if (vwtVar == null) {
                    throw new nud("Failed to find a corresponding image source extension converter for the a provided image source with extension identifier " + i8 + ". Make sure your runtime has a registered image source converter for extension identifier " + i8);
                }
                try {
                    agke agkeVarAF = ksy.aF(nchVarJ, i8);
                    aihl aihlVar2 = arnq.b;
                    aihlVar2.getClass();
                    MessageLite messageLiteBt = bt(agkeVarAF, aihlVar2.c.getParserForType(), ExtensionRegistryLite.getGeneratedRegistry());
                    messageLiteBt.getClass();
                    context.getClass();
                    arnq arnqVar = messageLiteBt instanceof arnq ? (arnq) messageLiteBt : null;
                    Object obj = vwtVar.a;
                    if (arnqVar != null) {
                        akcrVar = arnqVar.c;
                        if (akcrVar == null) {
                            akcrVar = akcr.a;
                        }
                    } else {
                        akcrVar = null;
                    }
                    ?? r7 = ((vwt) obj).a;
                    if (akcrVar != null) {
                        arqzVarA = arqz.a(akcrVar.c);
                        if (arqzVarA == null) {
                            arqzVarA = arqz.oX;
                        }
                    } else {
                        arqzVarA = null;
                    }
                    Drawable drawableD = r7.d(context, arqzVarA);
                    if (drawableD == null) {
                        drawableD = null;
                    } else if (akcrVar != null && (akcrVar.b & 2) != 0) {
                        ajwf ajwfVar = akcrVar.d;
                        if (ajwfVar == null) {
                            ajwfVar = ajwf.a;
                        }
                        ajwfVar.getClass();
                        aihl aihlVar3 = ajwh.a;
                        aihlVar3.getClass();
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar3);
                        ajwfVar.c(aihlVarCheckIsLite2);
                        if (ajwfVar.j.n(aihlVarCheckIsLite2.d)) {
                            aihlVar3.getClass();
                            aqlf aqlfVar = (aqlf) aext.x(ajwfVar, aihlVar3);
                            if (aecm.b(context) == 2) {
                                if ((aqlfVar.b & 2) != 0) {
                                    numQ = Integer.valueOf(aqlfVar.d);
                                } else {
                                    aihlVar = ajwg.a;
                                    aihlVar.getClass();
                                    aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                                    ajwfVar.c(aihlVarCheckIsLite);
                                    if (ajwfVar.j.n(aihlVarCheckIsLite.d)) {
                                        aihlVar.getClass();
                                        numQ = (Integer) aext.x(ajwfVar, aihlVar);
                                    } else {
                                        iAu = acfz.au(ajwfVar.b);
                                        if (iAu == 0) {
                                            iAu = 1;
                                        }
                                        numQ = acfz.Q(context, iAu);
                                    }
                                }
                            } else if ((aqlfVar.b & 1) != 0) {
                                numQ = Integer.valueOf(aqlfVar.c);
                            } else {
                                aihlVar = ajwg.a;
                                aihlVar.getClass();
                                aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                                ajwfVar.c(aihlVarCheckIsLite);
                                if (ajwfVar.j.n(aihlVarCheckIsLite.d)) {
                                    aihlVar.getClass();
                                    numQ = (Integer) aext.x(ajwfVar, aihlVar);
                                } else {
                                    iAu = acfz.au(ajwfVar.b);
                                    if (iAu == 0) {
                                        iAu = 1;
                                    }
                                    numQ = acfz.Q(context, iAu);
                                }
                            }
                        } else {
                            aihlVar = ajwg.a;
                            aihlVar.getClass();
                            aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                            ajwfVar.c(aihlVarCheckIsLite);
                            if (ajwfVar.j.n(aihlVarCheckIsLite.d)) {
                                aihlVar.getClass();
                                numQ = (Integer) aext.x(ajwfVar, aihlVar);
                            } else {
                                iAu = acfz.au(ajwfVar.b);
                                if (iAu == 0) {
                                    iAu = 1;
                                }
                                numQ = acfz.Q(context, iAu);
                            }
                        }
                        if (numQ != null) {
                            drawableD = new vmt(drawableD, numQ.intValue());
                        }
                    }
                    if (drawableD != null) {
                        if (z2 && iBA != 0 && ((drawableD instanceof VectorDrawable) || (drawableD instanceof dto))) {
                            drawableD.mutate().setTint(iBA);
                        }
                        nqnVar = new nqn(esqVar.f(drawableD), nclVarI);
                        break;
                    }
                } catch (aiik e) {
                    throw new nud("Failed to parse custom image source extension in ImageSourcesExtensionResolverImpl. Make sure custom image source has a valid extension.", e);
                }
            }
            i7++;
        }
        if (nqnVar != null) {
            i5 = i4;
        } else if (nciVar.g() == 0 && nciVar.m()) {
            i5 = i4;
            nqnVar = new nqn(esqVar.d(new BitmapDrawable(context.getResources(), Bitmap.createBitmap(i5, i5, Bitmap.Config.ALPHA_8))), null);
        } else {
            i5 = i4;
            nqnVar = null;
        }
        if (nqnVar == null) {
            i6 = i3;
            int iMax = Math.max(i, i6);
            int iMax2 = Math.max(i2, i6);
            if (iMax < 0) {
                throw new IllegalArgumentException();
            }
            if (iMax2 < 0) {
                throw new IllegalArgumentException();
            }
            if (nciVar == null || nciVar.g() == 0) {
                nclVar = null;
            } else {
                int i9 = i6;
                int i10 = i9;
                nclVar = null;
                while (i9 < nciVar.g()) {
                    ncl nclVarI2 = nciVar.i(i9);
                    if (nclVarI2 != null) {
                        int iH = iMax - nclVarI2.h();
                        int iG2 = iMax2 - nclVarI2.g();
                        int i11 = (iH * iH) + (iG2 * iG2);
                        if (nclVar == null || i11 < i10) {
                            nclVar = nclVarI2;
                            i10 = i11;
                        }
                    }
                    i9++;
                }
            }
            if (nclVar == null || TextUtils.isEmpty(nclVar.k())) {
                nqnVar = null;
            } else {
                nqnVar = new nqn(esqVar.c().f(bC(nclVar.k())), nclVar);
            }
        } else {
            i6 = i3;
        }
        nqn nqnVarBE = nqnVar == null ? bE(esqVar, context, nciVar, z2) : nqnVar;
        if (nqnVarBE == null) {
            ncl nclVarB = nqv.b(nciVar);
            if (nclVarB != null) {
                agev agevVarD = nqv.d(nclVarB);
                if (agevVarD.g()) {
                    nqnVarBE = new nqn(esqVar.g((byte[]) agevVarD.c()), nclVarB);
                } else {
                    nqnVarBE = null;
                }
            } else {
                nqnVarBE = null;
            }
        }
        if (nqnVarBE != null) {
            nqnVar2 = nqnVarBE;
        } else {
            if (nciVar3 == null) {
                return null;
            }
            nqnVar2 = new nqn(esqVar.f(null), null);
        }
        int iO = nciVar.o();
        esn esnVar = nqnVar2.a;
        if (iO == 5) {
            ncl nclVar2 = nqnVar2.b;
            int i12 = (nclVar2 == null || !nclVar2.n()) ? i6 : i5;
            if (!npy.f(context, nciVar) && i12 == 0) {
                esnVar = (esn) esnVar.v(evs.c);
            }
            esnVar = (esn) esnVar.B(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else if (z3 && nciVar.o() == 4) {
            esnVar = (esn) esnVar.x(fam.d);
        } else if (!z) {
            esnVar = (esn) esnVar.x(nciVar.o() + (-1) != 2 ? fam.d : fam.c);
        }
        if (nciVar2 != null) {
            int iB = npy.b(context, nciVar2);
            if (iB != 0) {
                esnVar.C(iB);
            } else {
                agev agevVarC = nqv.c(nciVar2);
                if (agevVarC.g()) {
                    esnVar.D(nqv.a(context, (byte[]) agevVarC.c()));
                }
            }
        }
        if (nciVar3 == null) {
            return nqnVar2;
        }
        int iB2 = npy.b(context, nciVar3);
        if (iB2 != 0) {
            esnVar.y(iB2);
            return nqnVar2;
        }
        agev agevVarC2 = nqv.c(nciVar3);
        if (!agevVarC2.g()) {
            return nqnVar2;
        }
        esnVar.z(nqv.a(context, (byte[]) agevVarC2.c()));
        return nqnVar2;
    }

    public static ntv bP(mla mlaVar, nvp nvpVar, agev agevVar, nuc nucVar, nry nryVar, hed hedVar, omj omjVar, agev agevVar2, agev agevVar3, agev agevVar4, agev agevVar5, agev agevVar6, agev agevVar7, agev agevVar8) {
        nuv nuvVar = (nuv) ((agfa) agevVar).a;
        boolean zBooleanValue = ((Boolean) agevVar2.e(Boolean.TRUE)).booleanValue();
        float fFloatValue = ((Float) agevVar3.e(Float.valueOf(0.0f))).floatValue();
        nub nubVar = (nub) ((agfa) agevVar4).a;
        Boolean bool = Boolean.FALSE;
        final nqg nqgVar = new nqg(((Boolean) agevVar6.e(bool)).booleanValue(), ((Boolean) agevVar7.e(bool)).booleanValue(), ((Boolean) agevVar8.e(bool)).booleanValue(), nucVar, zBooleanValue, ((Boolean) agevVar5.e(bool)).booleanValue(), nuvVar, nryVar, fFloatValue, nubVar, hedVar, omjVar);
        return mlaVar.a(nvpVar, new mky() { // from class: nqh
            @Override // defpackage.mky
            public final fgv a(fhd fhdVar, nsl nslVar, Object obj, String str, nds ndsVar, mip mipVar, List list) {
                nxs nxsVarBN;
                ncq ncqVar = (ncq) obj;
                if (!ncqVar.p()) {
                    throw new nud("ImageType.image missing");
                }
                nqg nqgVar2 = nqgVar;
                nci nciVarM = ncqVar.m();
                nqc nqcVar = new nqc(fhdVar, new nqf());
                nqf nqfVar = nqcVar.a;
                nqfVar.w = ncqVar;
                BitSet bitSet = nqcVar.d;
                bitSet.set(3);
                nqfVar.B = ndsVar;
                bitSet.set(5);
                boolean z = nqgVar2.a;
                nqfVar.x = z;
                nqfVar.s = nqgVar2.b;
                nqfVar.c = nqgVar2.c;
                nqfVar.t = nciVarM;
                boolean z2 = false;
                bitSet.set(0);
                nuc nucVar2 = nqgVar2.d;
                nqfVar.y = nucVar2;
                bitSet.set(4);
                nqfVar.C = nqgVar2.e;
                nqfVar.q = nqgVar2.f;
                if (ncqVar.n()) {
                    nqfVar.f = ncqVar.k();
                }
                if (ncqVar.o()) {
                    nqfVar.r = ncqVar.l();
                }
                nry nryVar2 = nqgVar2.h;
                nqfVar.u = nqgVar2.g;
                omj omjVar2 = new omj(nucVar2);
                if (!z && (nxsVarBN = qnl.bN(ncqVar, omjVar2, nslVar, nryVar2)) != null) {
                    nqfVar.b = nxsVarBN;
                }
                nub nubVar2 = nqgVar2.j;
                float f = nqgVar2.i;
                nqfVar.H = ncqVar.v();
                nqfVar.I = ncqVar.u();
                nqfVar.e = nslVar;
                nqfVar.v = f;
                nqfVar.g = nubVar2;
                if (ndsVar != null) {
                    mep mepVar = mwo.B;
                    if (ndsVar.e(mepVar) && ((mwo) ndsVar.d(mepVar)).l() && ((mwo) ndsVar.d(mepVar)).i().equals("primary_image")) {
                        z2 = true;
                    }
                    nqfVar.a = Boolean.valueOf(z2);
                }
                omj omjVar3 = nqgVar2.l;
                nqfVar.J = nqgVar2.k;
                bitSet.set(1);
                nqfVar.K = omjVar3;
                bitSet.set(2);
                nqfVar.d = nryVar2;
                if (ncqVar.q()) {
                    nqfVar.z = omjVar2.B(ncqVar.g(), nslVar).x();
                }
                if (ncqVar.r()) {
                    nqfVar.A = omjVar2.B(ncqVar.h(), nslVar).x();
                }
                return nqcVar;
            }
        }, null, ncq.Z, false);
    }

    public static tld bQ(tld tldVar, tld tldVar2) {
        return new tld(new pfn((Object) tldVar2, (Object) tldVar, 1));
    }

    public static Uri bR(Context context, int i, String str, String str2, qnl qnlVar, agev agevVar, boolean z) {
        try {
            return z ? bb(context, str2) : ba(context, agevVar).buildUpon().appendPath(bd(i)).build().buildUpon().appendPath(str).build();
        } catch (Exception e) {
            onb.g(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            return null;
        }
    }

    public static qnl bS(omn omnVar, aupr auprVar, aupr auprVar2, aupr auprVar3) {
        return new qnl();
    }

    public static olg bT(Context context, qnl qnlVar) {
        try {
            return olg.a(context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", olg.NEW_FILE_KEY.d));
        } catch (IllegalArgumentException unused) {
            bg(context);
            return olg.USE_CHECKSUM_ONLY;
        }
    }

    public static Uri ba(Context context, agev agevVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c((agevVar == null || !agevVar.g()) ? "datadownload" : (String) agevVar.c());
        if (agevVar != null && agevVar.g()) {
            qpqVar.d("datadownload");
        }
        return qpqVar.a();
    }

    public static Uri bb(Context context, String str) {
        agfm agfmVar = qps.a;
        return rmp.G(str, context.getPackageName(), 0L);
    }

    public static String bc(String str, agev agevVar) {
        if (agevVar != null && agevVar.g()) {
            str = str.concat((String) agevVar.c());
        }
        return str.concat(".pb");
    }

    public static String bd(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? "public_3p" : "private";
        }
        return "public";
    }

    public static omn be(omj omjVar, omn omnVar, aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, aupr auprVar7, aupr auprVar8, aupr auprVar9, aupr auprVar10, aupr auprVar11, aupr auprVar12, aupr auprVar13) {
        Object obj = omjVar.a;
        obj.getClass();
        qnl qnlVar = (qnl) auprVar2.io();
        omb ombVar = (omb) auprVar7.io();
        ayq ayqVar = (ayq) auprVar5.io();
        obj.getClass();
        Context context = (Context) obj;
        aesp aespVar = new aesp(context, (agfr) auprVar8.io(), (ayq) auprVar5.io(), (ooh) auprVar9.io(), (agev) auprVar10.io(), (onc) auprVar11.io(), (Executor) auprVar6.io(), (oii) auprVar4.io());
        agev agevVar = (agev) auprVar12.io();
        agev agevVar2 = (agev) auprVar10.io();
        ong ongVar = (ong) auprVar.io();
        oii oiiVar = (oii) auprVar4.io();
        return new omn(context, qnlVar, ombVar, ayqVar, aespVar, agevVar, agevVar2, ongVar, oiiVar, (agev) auprVar3.io(), (Executor) auprVar6.io());
    }

    public static xgg bf(omj omjVar, omn omnVar, aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, aupr auprVar7, aupr auprVar8, aupr auprVar9, aupr auprVar10, aupr auprVar11, aupr auprVar12, aupr auprVar13, aupr auprVar14, aupr auprVar15, aupr auprVar16, aupr auprVar17) {
        Object obj = omjVar.a;
        obj.getClass();
        ong ongVar = (ong) auprVar.io();
        qnl qnlVar = (qnl) auprVar2.io();
        ola olaVar = (ola) auprVar14.io();
        omn omnVarBe = be(omjVar, omnVar, auprVar, auprVar2, auprVar3, auprVar4, auprVar5, auprVar6, auprVar7, auprVar8, auprVar9, auprVar10, auprVar12, auprVar13, auprVar14);
        omj omjVar2 = (omj) auprVar11.io();
        Executor executor = (Executor) auprVar6.io();
        agev agevVar = (agev) auprVar3.io();
        ayq ayqVar = (ayq) auprVar5.io();
        agev agevVar2 = (agev) auprVar16.io();
        bS(omnVar, auprVar4, auprVar6, auprVar14);
        return new xgg((Context) obj, ongVar, qnlVar, olaVar, omnVarBe, omjVar2, executor, agevVar, ayqVar, agevVar2, (oii) auprVar4.io(), (Executor) auprVar17.io());
    }

    public static void bg(Context context) {
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
    }

    public static boolean bh(Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    public static boolean bi(Context context, olg olgVar) {
        olgVar.name();
        int i = onb.a;
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", olgVar.d).commit();
    }

    public static void bj(Context context) {
        int i = onb.a;
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }

    public static void bk(Context context, Class cls, String str) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("key", str);
        context.startForegroundService(intent);
    }

    public static void bl(Context context, Class cls, String str) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("stop-service", true);
        intent.putExtra("key", str);
        context.startForegroundService(intent);
    }

    public static ojp bm(ohw ohwVar) {
        ahvf ahvfVarA = ojp.a();
        if ((ohwVar.b & 1) != 0) {
            ahvfVarA.j(ohwVar.c);
        }
        if ((ohwVar.b & 2) != 0) {
            ahvfVarA.i(ohwVar.d);
        }
        if ((ohwVar.b & 4) != 0) {
            ahvfVarA.h(ohwVar.e);
        }
        return ahvfVarA.g();
    }

    public static /* synthetic */ ohw bn() {
        aihf aihfVarCreateBuilder = ohw.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ohw ohwVar = (ohw) aihfVarCreateBuilder.instance;
        ohwVar.b |= 1;
        ohwVar.c = true;
        aihfVarCreateBuilder.copyOnWrite();
        ohw ohwVar2 = (ohw) aihfVarCreateBuilder.instance;
        ohwVar2.b |= 2;
        ohwVar2.d = true;
        aihfVarCreateBuilder.copyOnWrite();
        ohw ohwVar3 = (ohw) aihfVarCreateBuilder.instance;
        ohwVar3.b |= 4;
        ohwVar3.e = false;
        return (ohw) aihfVarCreateBuilder.build();
    }

    public static byte[] bo(String str) {
        byte[] bArrK = agyg.d.k(str);
        if (bArrK.length != 0 || str.length() <= 0) {
            return bArrK;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    public static ListenableFuture bp(lpa lpaVar) {
        final oai oaiVar = new oai(lpaVar);
        lpaVar.l(MoreExecutors.directExecutor(), new lot() { // from class: oah
            @Override // defpackage.lot
            public final void a(lpa lpaVar2) {
                boolean z = ((lpf) lpaVar2).c;
                oai oaiVar2 = oaiVar;
                if (z) {
                    oaiVar2.cancel(false);
                    return;
                }
                if (lpaVar2.j()) {
                    oaiVar2.set(lpaVar2.f());
                    return;
                }
                Exception excE = lpaVar2.e();
                if (excE == null) {
                    throw new IllegalStateException();
                }
                oaiVar2.setException(excE);
            }
        });
        return oaiVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, nxl] */
    public static nxl bq(agev agevVar, nuc nucVar) {
        if (agevVar.g()) {
            return agevVar.c();
        }
        if (c == null) {
            c = new nyd(nucVar);
        }
        return c;
    }

    public static Optional br(String str, boolean z) {
        int length;
        if (str == null) {
            length = -1;
        } else {
            String[] strArr = ahxu.a;
            length = -1;
            for (int i = 0; i < 2; i++) {
                int iLastIndexOf = str.lastIndexOf(strArr[i]);
                if (iLastIndexOf > length) {
                    length = iLastIndexOf;
                }
            }
        }
        if (length == -1) {
            return Optional.empty();
        }
        int iLastIndexOf2 = str.lastIndexOf(R.styleable.AppCompatTheme_windowMinWidthMajor, length);
        if (!z) {
            length = str.indexOf(R.styleable.AppCompatTheme_windowMinWidthMajor, length);
        }
        int i2 = iLastIndexOf2 + 1;
        if (length == -1) {
            length = str.length();
        }
        return Optional.of(str.substring(i2, length));
    }

    public static boolean bs(Resources resources) {
        Configuration configuration;
        return (resources == null || (configuration = resources.getConfiguration()) == null || configuration.getLayoutDirection() != 1) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public static MessageLite bt(agke agkeVar, aiix aiixVar, ExtensionRegistryLite extensionRegistryLite) {
        if (agkeVar.isEmpty()) {
            return aiixVar.h(new byte[0], extensionRegistryLite);
        }
        int i = aigm.l;
        aigl aiglVar = new aigl(new aiil(agkeVar), SemanticState.Obscured);
        ?? F = aiixVar.f(aiglVar, extensionRegistryLite);
        aiglVar.z(0);
        return F;
    }

    public static int bu(float f, DisplayMetrics displayMetrics) {
        return rpi.p(TypedValue.applyDimension(1, f, displayMetrics));
    }

    public static int bv(DisplayMetrics displayMetrics, nal nalVar) {
        if (nalVar == null || !by(nalVar) || nalVar.i() == 3 || nalVar.co() <= 0.0f) {
            return -1;
        }
        return bu(nalVar.co(), displayMetrics);
    }

    public static oyg bw(DisplayMetrics displayMetrics, nbn nbnVar) {
        float fCo;
        int i;
        float fCo2;
        int iD;
        if (nbnVar == null) {
            return null;
        }
        if (!nbnVar.j() && !nbnVar.i()) {
            return null;
        }
        nal nalVarH = nbnVar.j() ? nbnVar.h() : null;
        nal nalVarG = nbnVar.i() ? nbnVar.g() : null;
        float f = displayMetrics.density;
        if (nalVarH != null) {
            int iD2 = d(nalVarH.i());
            fCo = nalVarH.co();
            i = iD2;
        } else {
            fCo = 0.0f;
            i = 1;
        }
        if (nalVarG != null) {
            iD = d(nalVarG.i());
            fCo2 = nalVarG.co();
        } else {
            fCo2 = 0.0f;
            iD = 1;
        }
        oyg oygVar = new oyg(f, i, fCo, iD, fCo2);
        if (oygVar.a == 1 && oygVar.b == 1) {
            return null;
        }
        return oygVar;
    }

    public static void bx(nak nakVar, nyb nybVar) {
        c(nakVar.ak(), 9, nakVar.g(), nybVar);
        c(nakVar.r(), 7, nakVar.j(), nybVar);
        c(nakVar.w(), 8, nakVar.o(), nybVar);
        c(nakVar.s(), 1, nakVar.k(), nybVar);
        c(nakVar.v(), 2, nakVar.n(), nybVar);
        c(nakVar.t(), 3, nakVar.l(), nybVar);
        c(nakVar.p(), 4, nakVar.h(), nybVar);
        c(nakVar.u(), 5, nakVar.m(), nybVar);
        c(nakVar.q(), 6, nakVar.i(), nybVar);
    }

    public static boolean by(nal nalVar) {
        return nalVar.h() || nalVar.g();
    }

    public static Map bz(nrg nrgVar, fly flyVar) {
        ntt nttVar;
        HashMap map = null;
        if (nrgVar.b() && (nttVar = (ntt) flyVar.c(ntt.class)) != null) {
            map = new HashMap();
            String str = nttVar.a;
            if (str != null) {
                map.put("CellLogId", str);
            }
            String str2 = nttVar.c;
            if (str2 != null) {
                map.put("CELL_NODE_ID", str2);
            }
        }
        return map;
    }

    private static void c(boolean z, int i, nal nalVar, nyb nybVar) {
        if (z && by(nalVar)) {
            nybVar.a(i, nalVar);
        }
    }

    private static int d(int i) {
        return i != 3 ? 2 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:40:0x009b->B:58:?, LOOP_END, SYNTHETIC] */
    public static String l(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int iMyPid;
        String str = a;
        if (str == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                String processName = Application.getProcessName();
                a = processName;
                return processName;
            }
            if ("robolectric".equals(Build.FINGERPRINT)) {
                runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    iMyPid = Process.myPid();
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            str = runningAppProcessInfo.processName;
                        }
                    }
                    str = null;
                } else {
                    str = null;
                }
                a = str;
            } else {
                try {
                    Method declaredMethod = Class.forName("android.app.ActivityThread", false, qnl.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, null);
                    str = objInvoke instanceof String ? (String) objInvoke : null;
                } catch (Throwable unused) {
                }
                a = str;
                if (str == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/cmdline"), 50);
                            try {
                                String strTrim = bufferedReader.readLine().trim();
                                bufferedReader.close();
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                str = strTrim;
                                a = str;
                                if (str == null) {
                                    runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                                    if (runningAppProcesses != null) {
                                        iMyPid = Process.myPid();
                                        while (r5.hasNext()) {
                                            if (runningAppProcessInfo.pid == iMyPid) {
                                                str = runningAppProcessInfo.processName;
                                            }
                                        }
                                        str = null;
                                    } else {
                                        str = null;
                                    }
                                    a = str;
                                }
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Exception e) {
                            Log.e("CurrentProcess", "Unable to read /proc/self/cmdline", e);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            str = null;
                        }
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                }
            }
        }
        return str;
    }

    public static boolean m() {
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(Process.isApplicationUid(Process.myUid()));
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static void n(ListenableFuture listenableFuture) {
        listenableFuture.addListener(new mbo(listenableFuture, 14), MoreExecutors.directExecutor());
    }

    public static /* synthetic */ boolean o(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        while (!atomicReferenceArray.compareAndSet(i, null, obj)) {
            if (atomicReferenceArray.get(i) != null) {
                return false;
            }
        }
        return true;
    }

    public static int p(int i) {
        if (i == 0) {
            return 6;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i != 4) {
            return i != 5 ? 0 : 5;
        }
        return 4;
    }

    public static void q(Level level, Executor executor, Throwable th, String str, Object... objArr) {
        executor.execute(afwl.i(new mrh(level, th, str, objArr, 4)));
    }

    public static Object r(qjy qjyVar) {
        try {
            return qjyVar.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return qjyVar.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static long s(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static List t(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasTimers(i)) ? Collections.EMPTY_LIST : qez.a.e(healthStats.getTimers(i));
    }

    public static Map u(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.EMPTY_MAP : healthStats.getStats(i);
    }

    public static axfy v(String str) {
        aihf aihfVarCreateBuilder = axfy.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        axfy axfyVar = (axfy) aihfVarCreateBuilder.instance;
        axfyVar.b |= 2;
        axfyVar.d = str;
        return (axfy) aihfVarCreateBuilder.build();
    }

    public static axgd w(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return y(null, healthStats.getTimer(i));
    }

    public static axgd x(axgd axgdVar, axgd axgdVar2) {
        if (axgdVar == null || axgdVar2 == null) {
            return axgdVar;
        }
        int i = axgdVar.c - axgdVar2.c;
        long j = axgdVar.d - axgdVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        aihf aihfVarCreateBuilder = axgd.a.createBuilder();
        if ((axgdVar.b & 4) != 0) {
            axfy axfyVar = axgdVar.e;
            if (axfyVar == null) {
                axfyVar = axfy.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            axgd axgdVar3 = (axgd) aihfVarCreateBuilder.instance;
            axfyVar.getClass();
            axgdVar3.e = axfyVar;
            axgdVar3.b |= 4;
        }
        aihfVarCreateBuilder.copyOnWrite();
        axgd axgdVar4 = (axgd) aihfVarCreateBuilder.instance;
        axgdVar4.b |= 1;
        axgdVar4.c = i;
        aihfVarCreateBuilder.copyOnWrite();
        axgd axgdVar5 = (axgd) aihfVarCreateBuilder.instance;
        axgdVar5.b |= 2;
        axgdVar5.d = j;
        return (axgd) aihfVarCreateBuilder.build();
    }

    public static axgd y(String str, TimerStat timerStat) {
        aihf aihfVarCreateBuilder = axgd.a.createBuilder();
        int count = timerStat.getCount();
        aihfVarCreateBuilder.copyOnWrite();
        axgd axgdVar = (axgd) aihfVarCreateBuilder.instance;
        axgdVar.b |= 1;
        axgdVar.c = count;
        long time = timerStat.getTime();
        aihfVarCreateBuilder.copyOnWrite();
        axgd axgdVar2 = (axgd) aihfVarCreateBuilder.instance;
        axgdVar2.b |= 2;
        axgdVar2.d = time;
        if (axgdVar2.c < 0) {
            aihfVarCreateBuilder.copyOnWrite();
            axgd axgdVar3 = (axgd) aihfVarCreateBuilder.instance;
            axgdVar3.b |= 1;
            axgdVar3.c = 0;
        }
        if (str != null) {
            aihf aihfVarCreateBuilder2 = axfy.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            axfy axfyVar = (axfy) aihfVarCreateBuilder2.instance;
            axfyVar.b |= 2;
            axfyVar.d = str;
            axfy axfyVar2 = (axfy) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            axgd axgdVar4 = (axgd) aihfVarCreateBuilder.instance;
            axfyVar2.getClass();
            axgdVar4.e = axfyVar2;
            axgdVar4.b |= 4;
        }
        axgd axgdVar5 = (axgd) aihfVarCreateBuilder.instance;
        if (axgdVar5.c == 0 && axgdVar5.d == 0) {
            return null;
        }
        return (axgd) aihfVarCreateBuilder.build();
    }

    public static boolean z(axfz axfzVar) {
        if (axfzVar != null) {
            return axfzVar.c.size() == 0 && axfzVar.d.size() == 0;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ mlt in(nsl nslVar, ndv ndvVar) {
        throw null;
    }

    public qnl(short[] sArr) {
    }

    public qnl(Context context) {
        context.getPackageName();
        AccountManager.get(context);
    }

    private qnl() {
    }

    public qnl(pls plsVar, pun punVar, char[] cArr) {
        plsVar.getClass();
        punVar.getClass();
    }

    public qnl(pls plsVar, pds pdsVar, pun punVar) {
        plsVar.getClass();
        pdsVar.getClass();
        punVar.getClass();
    }

    public qnl(pls plsVar, pun punVar, byte[] bArr) {
        plsVar.getClass();
        punVar.getClass();
    }

    public qnl(pls plsVar, pun punVar) {
        plsVar.getClass();
        punVar.getClass();
    }

    public qnl(pls plsVar) {
        plsVar.getClass();
    }

    public qnl(int[] iArr) {
        new AtomicBoolean(false);
    }
}
