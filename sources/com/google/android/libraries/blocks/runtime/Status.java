package com.google.android.libraries.blocks.runtime;

import com.google.net.util.proto2api.Status$StatusProto;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.ahxw;
import defpackage.aihn;
import defpackage.aiov;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class Status {
    public final ahxw a;
    public final String b;
    public final aiov c;

    /* JADX INFO: renamed from: com.google.android.libraries.blocks.runtime.Status$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ahxw.values().length];
            a = iArr;
            try {
                iArr[ahxw.CANCELLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ahxw.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ahxw.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ahxw.DEADLINE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ahxw.NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ahxw.ALREADY_EXISTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ahxw.PERMISSION_DENIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ahxw.UNAUTHENTICATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ahxw.RESOURCE_EXHAUSTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ahxw.FAILED_PRECONDITION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ahxw.ABORTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ahxw.OUT_OF_RANGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[ahxw.UNIMPLEMENTED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[ahxw.INTERNAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[ahxw.UNAVAILABLE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[ahxw.DATA_LOSS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public Status(ahxw ahxwVar, String str, aiov aiovVar) {
        this.a = ahxwVar;
        this.b = str;
        this.c = aiovVar;
    }

    static Throwable a(byte[] bArr) {
        String str;
        RuntimeException runtimeException = null;
        if (bArr != null) {
            Status$StatusProto status$StatusProto = (Status$StatusProto) aihn.parseFrom(Status$StatusProto.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            ahxw ahxwVarA = ahxw.a(status$StatusProto.c);
            ahxwVarA.getClass();
            Status status = new Status(ahxwVarA, status$StatusProto.e, null);
            switch (status.a.ordinal()) {
                case 1:
                    str = "CANCELLED";
                    break;
                case 2:
                    str = "UNKNOWN";
                    break;
                case 3:
                    str = "INVALID_ARGUMENT";
                    break;
                case 4:
                    str = "DEADLINE_EXCEEDED";
                    break;
                case 5:
                    str = "NOT_FOUND";
                    break;
                case 6:
                    str = "ALREADY_EXISTS";
                    break;
                case 7:
                    str = "PERMISSION_DENIED";
                    break;
                case 8:
                    str = "UNAUTHENTICATED";
                    break;
                case 9:
                    str = "RESOURCE_EXHAUSTED";
                    break;
                case 10:
                    str = "FAILED_PRECONDITION";
                    break;
                case 11:
                    str = "ABORTED";
                    break;
                case 12:
                    str = "OUT_OF_RANGE";
                    break;
                case 13:
                    str = "UNIMPLEMENTED";
                    break;
                case 14:
                    str = "INTERNAL";
                    break;
                case 15:
                    str = "UNAVAILABLE";
                    break;
                case 16:
                    str = "DATA_LOSS";
                    break;
                default:
                    str = "OK";
                    break;
            }
            runtimeException = new RuntimeException(String.format("%s: %s", str, status.b));
        }
        return runtimeException;
    }
}
