package com.google.android.libraries.youtube.composition.api;

import com.google.android.libraries.youtube.composition.common.concurrency.Callback;
import com.google.protos.youtube.api.innertube.CompositionProto$Composition;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class CompositorOptions {
    final CompositionProto$Composition composition;
    final Integer fps;
    final CompositorMode mode;
    final Callback onFrameProcessed;

    public CompositorOptions(CompositionProto$Composition compositionProto$Composition, CompositorMode compositorMode, Integer num, Callback callback) {
        this.composition = compositionProto$Composition;
        this.mode = compositorMode;
        this.fps = num;
        this.onFrameProcessed = callback;
    }

    public CompositionProto$Composition getComposition() {
        return this.composition;
    }

    public Integer getFps() {
        return this.fps;
    }

    public CompositorMode getMode() {
        return this.mode;
    }

    public Callback getOnFrameProcessed() {
        return this.onFrameProcessed;
    }

    public String toString() {
        Callback callback = this.onFrameProcessed;
        CompositorMode compositorMode = this.mode;
        return "CompositorOptions{composition=" + String.valueOf(this.composition) + ",mode=" + String.valueOf(compositorMode) + ",fps=" + this.fps + ",onFrameProcessed=" + String.valueOf(callback) + '}';
    }
}
