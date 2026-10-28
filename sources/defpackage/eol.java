package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eol {
    public final Object a;
    public final Object b;

    public eol(List list, List list2) {
        int size = list.size();
        this.b = new int[size];
        this.a = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.a)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public static final boolean A(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public static final KeyListener B(KeyListener keyListener) {
        if (!A(keyListener) || (keyListener instanceof bmk)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return !(keyListener instanceof NumberKeyListener) ? new bmk(keyListener) : keyListener;
    }

    private static void F(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public static /* synthetic */ List a(String str, String str2, dpt dptVar) {
        dptVar.getClass();
        dpb dpbVarA = dptVar.a(str);
        try {
            dpbVarA.i(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dpbVarA.l()) {
                arrayList.add(dpbVarA.d(0));
            }
            dpbVarA.close();
            return arrayList;
        } catch (Throwable th) {
            dpbVarA.close();
            throw th;
        }
    }

    public static /* synthetic */ awmy b(String str, String str2, dpt dptVar) {
        dptVar.getClass();
        dpb dpbVarA = dptVar.a(str);
        try {
            dpbVarA.i(1, str2);
            dpbVarA.l();
            return awmy.a;
        } finally {
            dpbVarA.close();
        }
    }

    public static /* synthetic */ int c(String str, String str2, dpt dptVar) {
        dptVar.getClass();
        dpb dpbVarA = dptVar.a(str);
        try {
            dpbVarA.i(1, str2);
            dpbVarA.l();
            return ape.n(dptVar);
        } finally {
            dpbVarA.close();
        }
    }

    public static /* synthetic */ List d(String str, dpt dptVar) {
        dptVar.getClass();
        dpb dpbVarA = dptVar.a(str);
        try {
            int iM = ape.m(dpbVarA, "id");
            int iM2 = ape.m(dpbVarA, "state");
            int iM3 = ape.m(dpbVarA, "worker_class_name");
            int iM4 = ape.m(dpbVarA, "input_merger_class_name");
            int iM5 = ape.m(dpbVarA, "input");
            int iM6 = ape.m(dpbVarA, "output");
            int iM7 = ape.m(dpbVarA, "initial_delay");
            int iM8 = ape.m(dpbVarA, "interval_duration");
            int iM9 = ape.m(dpbVarA, "flex_duration");
            int iM10 = ape.m(dpbVarA, "run_attempt_count");
            int iM11 = ape.m(dpbVarA, "backoff_policy");
            int iM12 = ape.m(dpbVarA, "backoff_delay_duration");
            int iM13 = ape.m(dpbVarA, "last_enqueue_time");
            int iM14 = ape.m(dpbVarA, "minimum_retention_duration");
            int iM15 = ape.m(dpbVarA, "schedule_requested_at");
            int iM16 = ape.m(dpbVarA, "run_in_foreground");
            int iM17 = ape.m(dpbVarA, "out_of_quota_policy");
            int iM18 = ape.m(dpbVarA, "period_count");
            int iM19 = ape.m(dpbVarA, "generation");
            int iM20 = ape.m(dpbVarA, "next_schedule_time_override");
            int iM21 = ape.m(dpbVarA, "next_schedule_time_override_generation");
            int iM22 = ape.m(dpbVarA, "stop_reason");
            int iM23 = ape.m(dpbVarA, "trace_tag");
            int iM24 = ape.m(dpbVarA, "backoff_on_system_interruptions");
            int iM25 = ape.m(dpbVarA, "required_network_type");
            int iM26 = ape.m(dpbVarA, "required_network_request");
            int iM27 = ape.m(dpbVarA, "requires_charging");
            int iM28 = ape.m(dpbVarA, "requires_device_idle");
            int iM29 = ape.m(dpbVarA, "requires_battery_not_low");
            int iM30 = ape.m(dpbVarA, "requires_storage_not_low");
            int iM31 = ape.m(dpbVarA, "trigger_content_update_delay");
            int iM32 = ape.m(dpbVarA, "trigger_max_content_delay");
            int iM33 = ape.m(dpbVarA, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dpbVarA.l()) {
                String strD = dpbVarA.d(iM);
                int i = iM14;
                ArrayList arrayList2 = arrayList;
                dzr dzrVarM = dms.m((int) dpbVarA.b(iM2));
                String strD2 = dpbVarA.d(iM3);
                String strD3 = dpbVarA.d(iM4);
                byte[] bArrM = dpbVarA.m(iM5);
                dyp dypVar = dyp.a;
                dyp dypVarG = azx.g(bArrM);
                dyp dypVarG2 = azx.g(dpbVarA.m(iM6));
                long jB = dpbVarA.b(iM7);
                long jB2 = dpbVarA.b(iM8);
                long jB3 = dpbVarA.b(iM9);
                int iB = (int) dpbVarA.b(iM10);
                int i2 = iM2;
                int i3 = iM3;
                int iW = dms.w((int) dpbVarA.b(iM11));
                long jB4 = dpbVarA.b(iM12);
                long jB5 = dpbVarA.b(iM13);
                long jB6 = dpbVarA.b(i);
                int i4 = iM15;
                long jB7 = dpbVarA.b(i4);
                int i5 = iM;
                int i6 = iM16;
                boolean z = ((int) dpbVarA.b(i6)) != 0;
                int i7 = iM17;
                int i8 = iM4;
                int iU = dms.u((int) dpbVarA.b(i7));
                int i9 = iM18;
                int i10 = iM5;
                int iB2 = (int) dpbVarA.b(i9);
                int i11 = iM19;
                int iB3 = (int) dpbVarA.b(i11);
                int i12 = iM20;
                long jB8 = dpbVarA.b(i12);
                int i13 = iM21;
                int iB4 = (int) dpbVarA.b(i13);
                int i14 = iM22;
                int iB5 = (int) dpbVarA.b(i14);
                int i15 = iM23;
                Boolean boolValueOf = null;
                String strD4 = dpbVarA.k(i15) ? null : dpbVarA.d(i15);
                int i16 = iM24;
                Integer numValueOf = dpbVarA.k(i16) ? null : Integer.valueOf((int) dpbVarA.b(i16));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i17 = iM25;
                Boolean bool = boolValueOf;
                int iT = dms.t((int) dpbVarA.b(i17));
                int i18 = iM26;
                efo efoVarN = dms.n(dpbVarA.m(i18));
                iM25 = i17;
                iM26 = i18;
                int i19 = iM27;
                boolean z2 = ((int) dpbVarA.b(i19)) != 0;
                iM27 = i19;
                int i20 = iM28;
                boolean z3 = ((int) dpbVarA.b(i20)) != 0;
                int i21 = iM29;
                boolean z4 = ((int) dpbVarA.b(i21)) != 0;
                iM29 = i21;
                int i22 = iM30;
                int i23 = iM31;
                int i24 = iM32;
                int i25 = iM33;
                iM33 = i25;
                arrayList2.add(new ees(strD, dzrVarM, strD2, strD3, dypVarG, dypVarG2, jB, jB2, jB3, new dyn(efoVarN, iT, z2, z3, z4, ((int) dpbVarA.b(i22)) != 0, dpbVarA.b(i23), dpbVarA.b(i24), dms.o(dpbVarA.m(i25))), iB, iW, jB4, jB5, jB6, jB7, z, iU, iB2, iB3, jB8, iB4, iB5, strD4, bool));
                iM30 = i22;
                iM4 = i8;
                iM17 = i7;
                iM19 = i11;
                iM22 = i14;
                iM24 = i16;
                iM31 = i23;
                iM32 = i24;
                iM2 = i2;
                iM14 = i;
                iM3 = i3;
                arrayList = arrayList2;
                iM = i5;
                iM15 = i4;
                iM16 = i6;
                iM20 = i12;
                iM21 = i13;
                iM23 = i15;
                iM28 = i20;
                iM5 = i10;
                iM18 = i9;
            }
            return arrayList;
        } finally {
            dpbVarA.close();
        }
    }

    public static /* synthetic */ boolean e(String str, String str2, dpt dptVar) {
        dptVar.getClass();
        dpb dpbVarA = dptVar.a(str);
        try {
            dpbVarA.i(1, str2);
            return dpbVarA.l() && ((int) dpbVarA.b(0)) != 0;
        } finally {
            dpbVarA.close();
        }
    }

    public static final KeyListener l(KeyListener keyListener) {
        return !(keyListener instanceof bly) ? new bly(keyListener) : keyListener;
    }

    public static /* synthetic */ List s(Object[] objArr) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        obj.getClass();
        arrayList.add(obj);
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static final boolean u(String str, String str2) {
        return avh.b(str).startsWith(avh.b(str2) + '/');
    }

    public static void y(Map map, String str, String str2) {
        Set afxVar = (Set) map.get(str);
        if (afxVar == null) {
            afxVar = new afx(0);
            map.put(str, afxVar);
        }
        afxVar.add(str2);
    }

    public final InputConnection C(InputConnection inputConnection) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof bmj) ? new bmj((TextView) ((eol) this.a).b, inputConnection) : inputConnection;
    }

    public final void D(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((Messenger) this.a).send(messageObtain);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void E(aami aamiVar) {
        int i = aamiVar.a;
        if (i != 0) {
            this.b.execute(new awu(this.a, i, 0, (char[]) null));
        } else {
            Object obj = aamiVar.b;
            this.b.execute(new bg(this.a, obj, 20, (short[]) null));
        }
    }

    public final byte[] f(cxt cxtVar) {
        Object obj = this.b;
        ((ByteArrayOutputStream) obj).reset();
        try {
            Object obj2 = this.a;
            F((DataOutputStream) obj2, cxtVar.a);
            String str = cxtVar.b;
            if (str == null) {
                str = "";
            }
            F((DataOutputStream) obj2, str);
            ((DataOutputStream) obj2).writeLong(cxtVar.c);
            ((DataOutputStream) obj2).writeLong(cxtVar.d);
            ((DataOutputStream) obj2).write(cxtVar.e);
            ((DataOutputStream) obj2).flush();
            return ((ByteArrayOutputStream) obj).toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [cvd, java.lang.Object] */
    public final cvi g(Object... objArr) {
        Constructor constructorA;
        Object obj = this.b;
        synchronized (obj) {
            try {
                if (!((AtomicBoolean) obj).get()) {
                    try {
                        constructorA = this.a.a();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.b).set(true);
                        constructorA = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorA = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (cvi) constructorA.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void h(String str, Object obj) {
        obj.getClass();
        this.a.put(str, obj);
        this.b.remove(str);
    }

    public final void i(long j) {
        h("exo_len", Long.valueOf(j));
    }

    public final void j() {
        TextView textView = (TextView) this.a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod == null || (transformationMethod instanceof PasswordTransformationMethod)) {
            return;
        }
        if (!(transformationMethod instanceof bmb)) {
            transformationMethod = new bmb(transformationMethod);
        }
        textView.setTransformationMethod(transformationMethod);
    }

    public final InputConnection k(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof blw) ? new blw((TextView) this.a, inputConnection, editorInfo) : inputConnection;
    }

    public final void m(Runnable runnable) {
        ((Choreographer) this.a).postFrameCallback(new ogt(runnable, 1));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final int n(String str, int i) {
        q(str);
        return this.b.getInt(str, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final long o(String str, long j) {
        q(str);
        return this.b.getLong(str, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean p(String str) {
        q(str);
        return this.b.contains(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void q(String str) {
        ?? r0 = this.a;
        if (r0 != 0 && !r0.contains(str)) {
            throw new IllegalStateException("Can't access key outside migration: ".concat(str));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final String r(String str) {
        q(str);
        return this.b.getString(str, "");
    }

    public final File t(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            Objects.toString(uri);
            throw new IllegalArgumentException("Unable to find path from root: ".concat(String.valueOf(uri)));
        }
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) ((HashMap) this.b).get(strDecode);
        if (file == null) {
            Objects.toString(uri);
            throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (u(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            file2.toString();
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file2.toString()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ais, java.lang.Object] */
    public final ane v() {
        return (ane) this.b.e();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Set w(String str) {
        return (Set) this.b.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void x(String str, String str2) {
        y(this.b, str, str2);
    }

    public final void z(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, he.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            bmn bmnVar = (bmn) ((eol) this.a).a;
            if (bmnVar.a != z) {
                bmnVar.a = z;
                if (z) {
                    synchronized (bme.a) {
                        bme bmeVar = bme.b;
                        azs.h(false, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                    }
                    throw null;
                }
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public eol(int i, int i2, int i3) {
        this.b = new int[]{i, i2, i3};
        this.a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public eol(TextView textView) {
        this.a = textView;
        this.b = new blx(textView);
    }

    public eol(byd bydVar) {
        this.a = new fsz((byte[]) null, (byte[]) null);
        this.b = bydVar;
    }

    public eol(ckl cklVar) {
        this.a = cklVar.a;
        this.b = cklVar.b;
    }

    public eol(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public eol(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public eol(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public eol(yv yvVar) {
        this.a = yvVar.a;
        this.b = yvVar.b;
    }

    public eol(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public eol(IBinder iBinder, Bundle bundle) {
        this.a = new Messenger(iBinder);
        this.b = bundle;
    }

    public eol(EditText editText) {
        this.b = editText;
        bmn bmnVar = new bmn(editText);
        this.a = bmnVar;
        editText.addTextChangedListener(bmnVar);
        editText.setEditableFactory(bmi.a());
    }

    public eol(anq anqVar, ane aneVar) {
        this.a = anqVar;
        this.b = new aid(aneVar, aii.c);
    }

    public eol(bto btoVar, int[] iArr) {
        if (iArr.length == 0) {
            bvx.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = btoVar;
        this.b = iArr;
    }

    public eol(String str, char[] cArr) {
        this.b = new HashMap();
        this.a = str;
    }

    public eol(int i, int i2) {
        this.b = new int[]{i, i2};
        this.a = new float[]{0.0f, 1.0f};
    }

    public eol(byte[] bArr, byte[] bArr2) {
        this.b = new afv();
        this.a = new afv();
    }

    public eol(EditText editText, char[] cArr) {
        this.b = editText;
        this.a = new eol(editText);
    }

    public eol(cvd cvdVar) {
        this.a = cvdVar;
        this.b = new AtomicBoolean(false);
    }

    public eol(List list, int[] iArr, char[] cArr) {
        this.b = agke.n(list);
        this.a = iArr;
    }

    public eol() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(SemanticState.LiveRegion);
        this.b = byteArrayOutputStream;
        this.a = new DataOutputStream(byteArrayOutputStream);
    }

    public eol(List list, int[] iArr, byte[] bArr) {
        this.a = agke.n(list);
        this.b = iArr;
    }

    public eol(List list, int[] iArr) {
        this.a = agke.n(list);
        this.b = iArr;
    }

    public eol(SharedPreferences sharedPreferences, Set set) {
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        this.a = set;
    }

    public eol(String str, String str2) {
        str2.getClass();
        this.b = str;
        this.a = str2;
    }

    public eol(char[] cArr) {
        this.a = new HashMap();
        this.b = new ArrayList();
    }

    public eol(String str) {
        this.a = str;
        this.b = new JSONObject(str);
    }

    public eol(char[] cArr, byte[] bArr) {
        this.a = Choreographer.getInstance();
        this.b = Looper.myLooper();
    }

    public eol(EditText editText, byte[] bArr) {
        this.a = editText;
        bma bmaVar = new bma(editText);
        this.b = bmaVar;
        editText.addTextChangedListener(bmaVar);
        editText.setEditableFactory(blv.a());
    }
}
