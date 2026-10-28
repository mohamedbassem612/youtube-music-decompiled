package com.google.android.libraries.elements.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ContextSubscriptionInput {
    final long arenaHandle;
    final byte[] contextBytes;
    final long upbHandle;

    public ContextSubscriptionInput(long j, long j2, byte[] bArr) {
        this.upbHandle = j;
        this.arenaHandle = j2;
        this.contextBytes = bArr;
    }

    public long getArenaHandle() {
        return this.arenaHandle;
    }

    public byte[] getContextBytes() {
        return this.contextBytes;
    }

    public long getUpbHandle() {
        return this.upbHandle;
    }

    public String toString() {
        return "ContextSubscriptionInput{upbHandle=" + this.upbHandle + ",arenaHandle=" + this.arenaHandle + ",contextBytes=" + String.valueOf(this.contextBytes) + '}';
    }
}
