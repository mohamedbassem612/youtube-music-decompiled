package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.util.SparseArray;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mgk {
    public final Object a;
    public Object b;

    public mgk(byte[] bArr) {
        this.a = new lqc();
        this.b = null;
    }

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.a;
            if (i >= sparseArray.size()) {
                sparseArray.clear();
                return;
            } else {
                ((lqd) ((zh) sparseArray.valueAt(i)).b).onDone();
                i++;
            }
        }
    }

    public final boolean b(Intent intent, int i, sxt sxtVar) {
        if (this.b == null) {
            this.b = new auym();
        }
        Object obj = ((auym) this.b).b;
        if (obj != null && ((SparseArray) obj).get(i) != null) {
            return false;
        }
        auym auymVar = (auym) this.b;
        if (auymVar.b == null) {
            auymVar.b = new SparseArray();
        }
        ((SparseArray) auymVar.b).put(i, sxtVar);
        ((Activity) this.a).startActivityForResult(intent, i, null);
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    public final void c(Exception exc, boolean z) {
        this.b = null;
        ?? r4 = this.a;
        agke agkeVarN = agke.n(r4);
        r4.clear();
        int size = agkeVarN.size();
        for (int i = 0; i < size; i++) {
            jth jthVar = (jth) agkeVarN.get(i);
            int i2 = 1;
            if (true != z) {
                i2 = 3;
            }
            jthVar.i(exc, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void d(jth jthVar) {
        this.a.add(jthVar);
        if (this.b == null) {
            this.b = jthVar;
            jthVar.l();
        }
    }

    public final void e(MediaCodec mediaCodec) {
        Object obj = this.b;
        if (obj == null || qe$$ExternalSyntheticApiModelOutline1.m938m(obj).addMediaCodec(mediaCodec)) {
            ahno.O(((HashSet) this.a).add(mediaCodec));
        }
    }

    public final void f(MediaCodec mediaCodec) {
        Object obj;
        if (!((HashSet) this.a).remove(mediaCodec) || (obj = this.b) == null) {
            return;
        }
        qe$$ExternalSyntheticApiModelOutline1.m938m(obj).removeMediaCodec(mediaCodec);
    }

    public final void g(int i) {
        Object obj = this.b;
        if (obj != null) {
            qe$$ExternalSyntheticApiModelOutline1.m938m(obj).close();
            this.b = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, MoreExecutors.directExecutor(), new clh());
        this.b = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.a).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public mgk(kpo kpoVar) {
        this.a = kpoVar == null ? null : kpoVar.b;
    }

    public mgk(Object obj) {
        this.a = obj;
    }

    public mgk() {
        this.a = new SparseArray();
    }

    public mgk(char[] cArr) {
        this.a = new HashSet();
    }

    public mgk(char[] cArr, byte[] bArr) {
        this.a = new HashSet();
    }

    public mgk(byte[] bArr, byte[] bArr2) {
        this.a = new LinkedHashSet();
    }
}
