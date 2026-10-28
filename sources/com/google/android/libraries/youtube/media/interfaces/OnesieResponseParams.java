package com.google.android.libraries.youtube.media.interfaces;

import com.google.protos.youtube.api.innertube.NextRequestPolicyOuterClass$NextRequestPolicy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class OnesieResponseParams {
    final boolean isActive;
    final NextRequestPolicyOuterClass$NextRequestPolicy nextRequestPolicy;

    public OnesieResponseParams(boolean z, NextRequestPolicyOuterClass$NextRequestPolicy nextRequestPolicyOuterClass$NextRequestPolicy) {
        this.isActive = z;
        this.nextRequestPolicy = nextRequestPolicyOuterClass$NextRequestPolicy;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public NextRequestPolicyOuterClass$NextRequestPolicy getNextRequestPolicy() {
        return this.nextRequestPolicy;
    }

    public String toString() {
        return "OnesieResponseParams{isActive=" + this.isActive + ",nextRequestPolicy=" + String.valueOf(this.nextRequestPolicy) + '}';
    }
}
