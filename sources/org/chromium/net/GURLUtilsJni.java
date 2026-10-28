package org.chromium.net;

import defpackage.auym;
import internal.J.N;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class GURLUtilsJni implements GURLUtils.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static auym sOverride;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, org.chromium.net.GURLUtils$Natives] */
    public static GURLUtils.Natives get() {
        ?? r0;
        auym auymVar = sOverride;
        return (auymVar == null || (r0 = auymVar.b) == 0) ? new GURLUtilsJni() : r0;
    }

    public static void setInstanceForTesting(GURLUtils.Natives natives) {
        auym auymVarA = sOverride;
        if (auymVarA == null) {
            auymVarA = auym.a();
            sOverride = auymVarA;
        }
        auymVarA.b = natives;
    }

    @Override // org.chromium.net.GURLUtils.Natives
    public String getOrigin(String str) {
        return (String) N.MpCt7siL(str);
    }
}
