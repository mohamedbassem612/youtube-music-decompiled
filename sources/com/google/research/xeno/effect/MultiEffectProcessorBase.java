package com.google.research.xeno.effect;

import android.media.AudioFormat;
import android.util.ArrayMap;
import android.util.Log;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.TextureFrame;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.MultiEffectProcessorBase;
import defpackage.agjw;
import defpackage.agke;
import defpackage.ahxj;
import defpackage.ahxk;
import defpackage.atth;
import defpackage.atus;
import defpackage.atuv;
import defpackage.atva;
import defpackage.atvh;
import defpackage.atvm;
import defpackage.atvn;
import defpackage.atvo;
import defpackage.atvq;
import defpackage.atwc;
import defpackage.atwd;
import defpackage.axoz;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class MultiEffectProcessorBase extends atvq implements ahxk, ahxj {
    public static final String f = atuv.class.getSimpleName();
    private EventManager a;

    protected MultiEffectProcessorBase(atth atthVar) {
        super(atthVar);
    }

    protected static native long nativeGetEventManager(long j);

    protected static native long nativeGetUserInteractionManager(long j);

    public static native void nativeLifecycleStartProcessing(long j, int i, long j2, long j3, int i2, int i3, NativeCallbacks$StateChangeRequestCallback nativeCallbacks$StateChangeRequestCallback);

    public static native void nativeLifecycleStopProcessing(long j, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native long nativeNewMultiEffectProcessorWithLifecycle(int i, long j, long j2, long j3, long j4, long[] jArr, long j5, byte[] bArr, NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback, NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback2, NativeCallbacks$AuxOutputCallback nativeCallbacks$AuxOutputCallback);

    public static native long nativeNewProcessor(int i, long j, long j2, long j3, long j4, long[] jArr, long j5, byte[] bArr, int i2, long j6, long j7, int i3, int i4, NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback, NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback2, NativeCallbacks$AuxOutputCallback nativeCallbacks$AuxOutputCallback);

    private static native void nativeRelease(long j);

    public static native void nativeSendAudioPacket(long j, long j2, long j3, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeSendFramePacket(long j, long j2, long j3, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeSendFramePacketWithPresentationTimestamp(long j, long j2, long j3, long j4, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeSubmitStateChangeRequest(long j, long[] jArr, long[] jArr2, int i, boolean z, long[] jArr3, NativeCallbacks$StateChangeRequestCallback nativeCallbacks$StateChangeRequestCallback);

    public static final long[] o(List list, ArrayMap arrayMap) {
        if (list.isEmpty()) {
            return null;
        }
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = ((Long) arrayMap.get(list.get(i))).longValue();
        }
        return jArr;
    }

    public final EventManager g() {
        return this.a;
    }

    public final void h(TextureFrame textureFrame, long j) {
        long timestamp = textureFrame.getTimestamp();
        Packet packetB = this.g.b(textureFrame);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((atus) it.next()).n(timestamp);
        }
        iD(new atvn(this, packetB, timestamp, j, 1));
        packetB.release();
    }

    @Override // defpackage.ahxj
    public final void iA(ByteBuffer byteBuffer, long j, AudioFormat audioFormat) {
        if (audioFormat.getChannelCount() == 0) {
            Log.e(f, "Current AudioFormat's channel count is 0");
            return;
        }
        Packet packetA = this.g.a(byteBuffer, audioFormat.getChannelCount(), (byteBuffer.limit() / 2) / audioFormat.getChannelCount());
        iD(new atvm(packetA, j, 1));
        packetA.release();
    }

    @Override // defpackage.ahxk
    public final void iB(TextureFrame textureFrame) {
        long timestamp = textureFrame.getTimestamp();
        Packet packetB = this.g.b(textureFrame);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((atus) it.next()).n(timestamp);
        }
        iD(new atvo(this, packetB, timestamp, 1));
        packetB.release();
    }

    @Override // defpackage.atvq
    protected final void iC(long j) {
        nativeRelease(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [atwc] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.research.xeno.effect.EventManager] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.research.xeno.effect.EventManager] */
    protected final void n(long j, atwd atwdVar, atwc atwcVar) {
        if (atwdVar == null) {
            UserInteractionManager.e(this, nativeGetUserInteractionManager(j));
        }
        if (atwcVar == 0) {
            atwcVar = EventManager.b(this, nativeGetEventManager(j));
        }
        this.a = atwcVar;
        super.m(j);
    }

    public final void p(final axoz axozVar, final atva atvaVar) {
        axoz axozVar2 = (axoz) axozVar.a;
        final agke agkeVarG = ((agjw) axozVar2.b).g();
        HashSet hashSet = new HashSet();
        Object obj = axozVar2.a;
        hashSet.addAll(obj);
        hashSet.addAll(agkeVarG);
        final agke agkeVarN = agke.n(hashSet);
        final agke agkeVar = (agke) obj;
        iD(new atvh() { // from class: atuy
            @Override // defpackage.atvh
            public final void a(final long j) {
                final agke agkeVar2 = agkeVarN;
                final agke agkeVar3 = agkeVar;
                final agke agkeVar4 = agkeVarG;
                final atva atvaVar2 = atvaVar;
                atqo.b(agkeVar2, new atvf() { // from class: atuz
                    @Override // defpackage.atvf
                    public final void a(long[] jArr) {
                        long[] jArr2;
                        long[] jArrO;
                        if (jArr != null) {
                            ArrayMap arrayMap = new ArrayMap();
                            for (int i = 0; i < jArr.length; i++) {
                                arrayMap.put((Effect) agkeVar2.get(i), Long.valueOf(jArr[i]));
                            }
                            agke agkeVar5 = agkeVar4;
                            long[] jArrO2 = MultiEffectProcessorBase.o(agkeVar3, arrayMap);
                            jArrO = MultiEffectProcessorBase.o(agkeVar5, arrayMap);
                            jArr2 = jArrO2;
                        } else {
                            jArr2 = null;
                            jArrO = null;
                        }
                        MultiEffectProcessorBase.nativeSubmitStateChangeRequest(j, jArr2, jArrO, 0, false, null, new atuw(atvaVar2));
                    }
                });
            }
        });
    }
}
