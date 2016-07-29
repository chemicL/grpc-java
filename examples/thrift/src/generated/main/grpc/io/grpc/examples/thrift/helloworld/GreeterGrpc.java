/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.grpc.examples.thrift.helloworld;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import io.grpc.thrift.ThriftUtils;

public class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "io.grpc.examples.thrift.helloworld.Greeter";

  @java.lang.Deprecated public static interface Greeter {
    public void sayHello(sayHello_args request,
        io.grpc.stub.StreamObserver<sayHello_result> responseObserver);

  }

  private static final int ARG_IN_METHOD_sayHello = 1;
  private static final int ARG_OUT_METHOD_sayHello = 2;

  private static final class ThriftMessageFactory<T extends org.apache.thrift.TBase<T,?>>
      implements io.grpc.thrift.MessageFactory<T> {
    private final int id;


    ThriftMessageFactory(int id) {
      this.id = id;
    }
    @java.lang.Override
    public T newInstance() {
      Object o;
      switch (id) {
      case ARG_IN_METHOD_sayHello:
        o = new sayHello_args();
        break;
      case ARG_OUT_METHOD_sayHello:
       o = new sayHello_result();
        break;
      default:
  throw new AssertionError();
}
      @java.lang.SuppressWarnings("unchecked")
      T t = (T) o;
return t;
    }
  }
  public static abstract class GreeterImplBase implements Greeter, io.grpc.BindableService {
    @java.lang.Override
    public void sayHello(sayHello_args request, 
        io.grpc.stub.StreamObserver<sayHello_result> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_sayHello, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return GreeterGrpc.bindService(this);
    }

  }

  @java.lang.Deprecated public static abstract class AbstractGreeter extends GreeterImplBase {}

  public static class sayHello_args implements org.apache.thrift.TBase<sayHello_args, sayHello_args._Fields>, java.io.Serializable, Cloneable, Comparable<sayHello_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("sayHello_args");

    private static final org.apache.thrift.protocol.TField REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("request", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final SchemeFactory STANDARD_SCHEME_FACTORY = new sayHello_argsStandardSchemeFactory();
    private static final SchemeFactory TUPLE_SCHEME_FACTORY = new sayHello_argsTupleSchemeFactory();

    public HelloRequest request; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      REQUEST((short)1, "request");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // REQUEST
            return REQUEST;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.REQUEST, new org.apache.thrift.meta_data.FieldMetaData("request", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HelloRequest.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(sayHello_args.class, metaDataMap);
    }

    public sayHello_args() {
    }

    public sayHello_args(
      HelloRequest request)
    {
      this();
      this.request = request;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public sayHello_args(sayHello_args other) {
      if (other.isSetRequest()) {
        this.request = new HelloRequest(other.request);
      }
    }

    public sayHello_args deepCopy() {
      return new sayHello_args(this);
    }

    @Override
    public void clear() {
      this.request = null;
    }

    public HelloRequest getRequest() {
      return this.request;
    }

    public sayHello_args setRequest(HelloRequest request) {
      this.request = request;
      return this;
    }

    public void unsetRequest() {
      this.request = null;
    }

    /** Returns true if field request is set (has been assigned a value) and false otherwise */
    public boolean isSetRequest() {
      return this.request != null;
    }

    public void setRequestIsSet(boolean value) {
      if (!value) {
        this.request = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case REQUEST:
        if (value == null) {
          unsetRequest();
        } else {
          setRequest((HelloRequest)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case REQUEST:
        return getRequest();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case REQUEST:
        return isSetRequest();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof sayHello_args)
        return this.equals((sayHello_args)that);
      return false;
    }

    public boolean equals(sayHello_args that) {
      if (that == null)
        return false;

      boolean this_present_request = true && this.isSetRequest();
      boolean that_present_request = true && that.isSetRequest();
      if (this_present_request || that_present_request) {
        if (!(this_present_request && that_present_request))
          return false;
        if (!this.request.equals(that.request))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + ((isSetRequest()) ? 131071 : 524287);
      if (isSetRequest())
        hashCode = hashCode * 8191 + request.hashCode();

      return hashCode;
    }

    @Override
    public int compareTo(sayHello_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetRequest()).compareTo(other.isSetRequest());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetRequest()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.request, other.request);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      scheme(oprot).write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("sayHello_args(");
      boolean first = true;

      sb.append("request:");
      if (this.request == null) {
        sb.append("null");
      } else {
        sb.append(this.request);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (request != null) {
        request.validate();
      }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class sayHello_argsStandardSchemeFactory implements SchemeFactory {
      public sayHello_argsStandardScheme getScheme() {
        return new sayHello_argsStandardScheme();
      }
    }

    private static class sayHello_argsStandardScheme extends StandardScheme<sayHello_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, sayHello_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // REQUEST
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.request = new HelloRequest();
                struct.request.read(iprot);
                struct.setRequestIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, sayHello_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.request != null) {
          oprot.writeFieldBegin(REQUEST_FIELD_DESC);
          struct.request.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class sayHello_argsTupleSchemeFactory implements SchemeFactory {
      public sayHello_argsTupleScheme getScheme() {
        return new sayHello_argsTupleScheme();
      }
    }

    private static class sayHello_argsTupleScheme extends TupleScheme<sayHello_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, sayHello_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetRequest()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetRequest()) {
          struct.request.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, sayHello_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.request = new HelloRequest();
          struct.request.read(iprot);
          struct.setRequestIsSet(true);
        }
      }
    }

    private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

  public static class sayHello_result implements org.apache.thrift.TBase<sayHello_result, sayHello_result._Fields>, java.io.Serializable, Cloneable, Comparable<sayHello_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("sayHello_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);

    private static final SchemeFactory STANDARD_SCHEME_FACTORY = new sayHello_resultStandardSchemeFactory();
    private static final SchemeFactory TUPLE_SCHEME_FACTORY = new sayHello_resultTupleSchemeFactory();

    public HelloResponse success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 0: // SUCCESS
            return SUCCESS;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HelloResponse.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(sayHello_result.class, metaDataMap);
    }

    public sayHello_result() {
    }

    public sayHello_result(
      HelloResponse success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public sayHello_result(sayHello_result other) {
      if (other.isSetSuccess()) {
        this.success = new HelloResponse(other.success);
      }
    }

    public sayHello_result deepCopy() {
      return new sayHello_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    public HelloResponse getSuccess() {
      return this.success;
    }

    public sayHello_result setSuccess(HelloResponse success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((HelloResponse)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof sayHello_result)
        return this.equals((sayHello_result)that);
      return false;
    }

    public boolean equals(sayHello_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int hashCode = 1;

      hashCode = hashCode * 8191 + ((isSetSuccess()) ? 131071 : 524287);
      if (isSetSuccess())
        hashCode = hashCode * 8191 + success.hashCode();

      return hashCode;
    }

    @Override
    public int compareTo(sayHello_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      scheme(iprot).read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      scheme(oprot).write(oprot, this);
      }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("sayHello_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (success != null) {
        success.validate();
      }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class sayHello_resultStandardSchemeFactory implements SchemeFactory {
      public sayHello_resultStandardScheme getScheme() {
        return new sayHello_resultStandardScheme();
      }
    }

    private static class sayHello_resultStandardScheme extends StandardScheme<sayHello_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, sayHello_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.success = new HelloResponse();
                struct.success.read(iprot);
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, sayHello_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class sayHello_resultTupleSchemeFactory implements SchemeFactory {
      public sayHello_resultTupleScheme getScheme() {
        return new sayHello_resultTupleScheme();
      }
    }

    private static class sayHello_resultTupleScheme extends TupleScheme<sayHello_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, sayHello_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          struct.success.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, sayHello_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = new HelloResponse();
          struct.success.read(iprot);
          struct.setSuccessIsSet(true);
        }
      }
    }

    private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
      return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
  }

  public static final io.grpc.MethodDescriptor<sayHello_args,
      sayHello_result> METHOD_sayHello = 
      io.grpc.MethodDescriptor.create(
        io.grpc.MethodDescriptor.MethodType.UNARY,
        generateFullMethodName("io.grpc.examples.thrift.helloworld.Greeter" , "sayHello"),
        io.grpc.thrift.ThriftUtils.marshaller(
        new ThriftMessageFactory<sayHello_args>( ARG_IN_METHOD_sayHello)),
        io.grpc.thrift.ThriftUtils.marshaller(
        new ThriftMessageFactory<sayHello_result>( ARG_OUT_METHOD_sayHello)));

  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  public static class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub>
      implements Greeter{
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel, 
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel, 
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    @java.lang.Override
    public void sayHello(sayHello_args request,
        io.grpc.stub.StreamObserver<sayHello_result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_sayHello, getCallOptions()), request, responseObserver);
    }

  }

  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  @java.lang.Deprecated public static interface GreeterBlockingClient {
    public sayHello_result sayHello(sayHello_args request);

  }

  public static class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub>
      implements GreeterBlockingClient {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel, 
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel, 
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public sayHello_result sayHello(sayHello_args request) {
      return blockingUnaryCall(
          getChannel(), METHOD_sayHello, getCallOptions(), request);
    }

  }

  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  @java.lang.Deprecated public static interface GreeterFutureClient {
    public com.google.common.util.concurrent.ListenableFuture<sayHello_result> sayHello(
        sayHello_args request);

  }

  public static class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub>
      implements GreeterFutureClient {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel, 
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel, 
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<sayHello_result> sayHello(
        sayHello_args request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_sayHello, getCallOptions()), request);
    }

  }

  private static final int METHODID_sayHello = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Greeter serviceImpl;
    private final int methodId;

    public MethodHandlers(Greeter serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_sayHello:
          serviceImpl.sayHello((sayHello_args) request,
              (io.grpc.stub.StreamObserver<sayHello_result>) responseObserver);
          break;

        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME    ,
        METHOD_sayHello);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final Greeter serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_sayHello,
          asyncUnaryCall(
            new MethodHandlers<
              sayHello_args,
              sayHello_result>(
                serviceImpl, METHODID_sayHello)))
        .build();
  }

}