package com.google.android.libraries.youtube.media.player.exo2.platypus.event;

import defpackage.agke;
import defpackage.agpi;
import defpackage.zam;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class PlatypusException extends zam {
    public final ErrorType a;
    public final agke b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: PG */
    public final class ErrorType {
        public static final ErrorType a;
        public static final ErrorType b;
        public static final ErrorType c;
        public static final ErrorType d;
        public static final ErrorType e;
        public static final ErrorType f;
        private static final /* synthetic */ ErrorType[] g;

        static {
            ErrorType errorType = new ErrorType("UNSUPPORTED_FORMAT", 0);
            a = errorType;
            ErrorType errorType2 = new ErrorType("UNSUPPORTED_TRACK_TYPE", 1);
            b = errorType2;
            ErrorType errorType3 = new ErrorType("PARSE_FAILURE", 2);
            c = errorType3;
            ErrorType errorType4 = new ErrorType("UNEXPECTED_ERROR", 3);
            d = errorType4;
            ErrorType errorType5 = new ErrorType("BUFFER_MANAGER_DISPOSED", 4);
            e = errorType5;
            ErrorType errorType6 = new ErrorType("REPEATED_SKIPPED_SEGMENTS", 5);
            f = errorType6;
            g = new ErrorType[]{errorType, errorType2, errorType3, errorType4, errorType5, errorType6};
        }

        public static ErrorType[] values() {
            return (ErrorType[]) g.clone();
        }
    }

    /* JADX INFO: compiled from: PG */
    public class PlatypusExceptionBuilder {
        private final ErrorType b;
        private final List c = new ArrayList();
        public Throwable a = null;

        public PlatypusExceptionBuilder(ErrorType errorType) {
            this.b = errorType;
        }

        public final PlatypusException a() {
            return new PlatypusException(this.b, this.a, this.c);
        }

        public final void b(String str, String str2) {
            this.c.add(str + '.' + str2);
        }

        public final void c(String str, long j) {
            b(str, String.valueOf(j));
        }
    }

    public PlatypusException(ErrorType errorType, Throwable th, List list) {
        super(errorType.toString(), th);
        this.a = errorType;
        this.b = agke.n(list);
    }

    public PlatypusException(ErrorType errorType, Throwable th) {
        this(errorType, th, agpi.a);
    }
}
