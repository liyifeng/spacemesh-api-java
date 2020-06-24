// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.24.0
// 	protoc        v3.12.3
// source: spacemesh/v1/tx_types.proto

package v1

import (
	proto "github.com/golang/protobuf/proto"
	status "google.golang.org/genproto/googleapis/rpc/status"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

type TransactionState_TransactionState int32

const (
	TransactionState_TRANSACTION_STATE_UNSPECIFIED        TransactionState_TransactionState = 0 // default state
	TransactionState_TRANSACTION_STATE_REJECTED           TransactionState_TransactionState = 1 // rejected from mempool due to, e.g., invalid syntax
	TransactionState_TRANSACTION_STATE_INSUFFICIENT_FUNDS TransactionState_TransactionState = 2 // rejected from mempool by funds check
	TransactionState_TRANSACTION_STATE_CONFLICTING        TransactionState_TransactionState = 3 // rejected from mempool due to conflicting counter
	TransactionState_TRANSACTION_STATE_MEMPOOL            TransactionState_TransactionState = 4 // in mempool but not on the mesh yet
	TransactionState_TRANSACTION_STATE_MESH               TransactionState_TransactionState = 5 // submitted to the mesh
	TransactionState_TRANSACTION_STATE_PROCESSED          TransactionState_TransactionState = 6 // processed by STF; check Receipt for success or failure
)

// Enum value maps for TransactionState_TransactionState.
var (
	TransactionState_TransactionState_name = map[int32]string{
		0: "TRANSACTION_STATE_UNSPECIFIED",
		1: "TRANSACTION_STATE_REJECTED",
		2: "TRANSACTION_STATE_INSUFFICIENT_FUNDS",
		3: "TRANSACTION_STATE_CONFLICTING",
		4: "TRANSACTION_STATE_MEMPOOL",
		5: "TRANSACTION_STATE_MESH",
		6: "TRANSACTION_STATE_PROCESSED",
	}
	TransactionState_TransactionState_value = map[string]int32{
		"TRANSACTION_STATE_UNSPECIFIED":        0,
		"TRANSACTION_STATE_REJECTED":           1,
		"TRANSACTION_STATE_INSUFFICIENT_FUNDS": 2,
		"TRANSACTION_STATE_CONFLICTING":        3,
		"TRANSACTION_STATE_MEMPOOL":            4,
		"TRANSACTION_STATE_MESH":               5,
		"TRANSACTION_STATE_PROCESSED":          6,
	}
)

func (x TransactionState_TransactionState) Enum() *TransactionState_TransactionState {
	p := new(TransactionState_TransactionState)
	*p = x
	return p
}

func (x TransactionState_TransactionState) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (TransactionState_TransactionState) Descriptor() protoreflect.EnumDescriptor {
	return file_spacemesh_v1_tx_types_proto_enumTypes[0].Descriptor()
}

func (TransactionState_TransactionState) Type() protoreflect.EnumType {
	return &file_spacemesh_v1_tx_types_proto_enumTypes[0]
}

func (x TransactionState_TransactionState) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use TransactionState_TransactionState.Descriptor instead.
func (TransactionState_TransactionState) EnumDescriptor() ([]byte, []int) {
	return file_spacemesh_v1_tx_types_proto_rawDescGZIP(), []int{7, 0}
}

type TransactionsIds struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TransactionId []*TransactionId `protobuf:"bytes,1,rep,name=transaction_id,json=transactionId,proto3" json:"transaction_id,omitempty"`
}

func (x *TransactionsIds) Reset() {
	*x = TransactionsIds{}
	if protoimpl.UnsafeEnabled {
		mi := &file_spacemesh_v1_tx_types_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TransactionsIds) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TransactionsIds) ProtoMessage() {}

func (x *TransactionsIds) ProtoReflect() protoreflect.Message {
	mi := &file_spacemesh_v1_tx_types_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TransactionsIds.ProtoReflect.Descriptor instead.
func (*TransactionsIds) Descriptor() ([]byte, []int) {
	return file_spacemesh_v1_tx_types_proto_rawDescGZIP(), []int{0}
}

func (x *TransactionsIds) GetTransactionId() []*TransactionId {
	if x != nil {
		return x.TransactionId
	}
	return nil
}

type SubmitTransactionRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Transaction []byte `protobuf:"bytes,1,opt,name=transaction,proto3" json:"transaction,omitempty"` // signed binary transaction
}

func (x *SubmitTransactionRequest) Reset() {
	*x = SubmitTransactionRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_spacemesh_v1_tx_types_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SubmitTransactionRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubmitTransactionRequest) ProtoMessage() {}

func (x *SubmitTransactionRequest) ProtoReflect() protoreflect.Message {
	mi := &file_spacemesh_v1_tx_types_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubmitTransactionRequest.ProtoReflect.Descriptor instead.
func (*SubmitTransactionRequest) Descriptor() ([]byte, []int) {
	return file_spacemesh_v1_tx_types_proto_rawDescGZIP(), []int{1}
}

func (x *SubmitTransactionRequest) GetTransaction() []byte {
	if x != nil {
		return x.Transaction
	}
	return nil
}

type SubmitTransactionResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Status  *status.Status    `protobuf:"bytes,1,opt,name=status,proto3" json:"status,omitempty"`
	Txstate *TransactionState `protobuf:"bytes,2,opt,name=txstate,proto3" json:"txstate,omitempty"`
}

func (x *SubmitTransactionResponse) Reset() {
	*x = SubmitTransactionResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_spacemesh_v1_tx_types_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SubmitTransactionResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubmitTransactionResponse) ProtoMessage() {}

func (x *SubmitTransactionResponse) ProtoReflect() protoreflect.Message {
	mi := &file_spacemesh_v1_tx_types_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubmitTransactionResponse.ProtoReflect.Descriptor instead.
func (*SubmitTransactionResponse) Descriptor() ([]byte, []int) {
	return file_spacemesh_v1_tx_types_proto_rawDescGZIP(), []int{2}
}

func (x *SubmitTransactionResponse) GetStatus() *status.Status {
	if x != nil {
		return x.Status
	}
	return nil
}

func (x *SubmitTransactionResponse) GetTxstate() *TransactionState {
	if x != nil {
		return x.Txstate
	}
	return nil
}

type TransactionsStateRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TransactionId []*TransactionId `protobuf:"bytes,1,rep,name=transaction_id,json=transactionId,proto3" json:"transaction_id,omitempty"`
}

func (x *TransactionsStateRequest) Reset() {
	*x = TransactionsStateRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_spacemesh_v1_tx_types_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TransactionsStateRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TransactionsStateRequest) ProtoMessage() {}

func (x *TransactionsStateRequest) ProtoReflect() protoreflect.Message {
	mi := &file_spacemesh_v1_tx_types_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TransactionsStateRequest.ProtoReflect.Descriptor instead.
func (*TransactionsStateRequest) Descriptor() ([]byte, []int) {
	return file_spacemesh_v1_tx_types_proto_rawDescGZIP(), []int{3}
}

func (x *TransactionsStateRequest) GetTransactionId() []*TransactionId {
	if x != nil {
		return x.TransactionId
	}
	return nil
}

type TransactionsStateResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TransactionsState []*TransactionState `protobuf:"bytes,1,rep,name=transactions_state,json=transactionsState,proto3" json:"transactions_state,omitempty"`
}

func (x *TransactionsStateResponse) Reset() {
	*x = TransactionsStateResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_spacemesh_v1_tx_types_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TransactionsStateResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TransactionsStateResponse) ProtoMessage() {}

func (x *TransactionsStateResponse) ProtoReflect() protoreflect.Message {
	mi := &file_spacemesh_v1_tx_types_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TransactionsStateResponse.ProtoReflect.Descriptor instead.
func (*TransactionsStateResponse) Descriptor() ([]byte, []int) {
	return file_spacemesh_v1_tx_types_proto_rawDescGZIP(), []int{4}
}

func (x *TransactionsStateResponse) GetTransactionsState() []*TransactionState {
	if x != nil {
		return x.TransactionsState
	}
	return nil
}

type TransactionsStateStreamRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TransactionId []*TransactionId `protobuf:"bytes,1,rep,name=transaction_id,json=transactionId,proto3" json:"transaction_id,omitempty"`
}

func (x *TransactionsStateStreamRequest) Reset() {
	*x = TransactionsStateStreamRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_spacemesh_v1_tx_types_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TransactionsStateStreamRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TransactionsStateStreamRequest) ProtoMessage() {}

func (x *TransactionsStateStreamRequest) ProtoReflect() protoreflect.Message {
	mi := &file_spacemesh_v1_tx_types_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TransactionsStateStreamRequest.ProtoReflect.Descriptor instead.
func (*TransactionsStateStreamRequest) Descriptor() ([]byte, []int) {
	return file_spacemesh_v1_tx_types_proto_rawDescGZIP(), []int{5}
}

func (x *TransactionsStateStreamRequest) GetTransactionId() []*TransactionId {
	if x != nil {
		return x.TransactionId
	}
	return nil
}

type TransactionsStateStreamResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TransactionsState []*TransactionState `protobuf:"bytes,1,rep,name=transactions_state,json=transactionsState,proto3" json:"transactions_state,omitempty"`
}

func (x *TransactionsStateStreamResponse) Reset() {
	*x = TransactionsStateStreamResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_spacemesh_v1_tx_types_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TransactionsStateStreamResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TransactionsStateStreamResponse) ProtoMessage() {}

func (x *TransactionsStateStreamResponse) ProtoReflect() protoreflect.Message {
	mi := &file_spacemesh_v1_tx_types_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TransactionsStateStreamResponse.ProtoReflect.Descriptor instead.
func (*TransactionsStateStreamResponse) Descriptor() ([]byte, []int) {
	return file_spacemesh_v1_tx_types_proto_rawDescGZIP(), []int{6}
}

func (x *TransactionsStateStreamResponse) GetTransactionsState() []*TransactionState {
	if x != nil {
		return x.TransactionsState
	}
	return nil
}

// TransactionState is the "journey" of a tx from mempool to block inclusion to
// mesh to STF processing. To know whether or not the tx actually succeeded,
// and its side effects, check the Receipt in the GlobalStateService.
type TransactionState struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id    *TransactionId                    `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	State TransactionState_TransactionState `protobuf:"varint,2,opt,name=state,proto3,enum=spacemesh.v1.TransactionState_TransactionState" json:"state,omitempty"`
}

func (x *TransactionState) Reset() {
	*x = TransactionState{}
	if protoimpl.UnsafeEnabled {
		mi := &file_spacemesh_v1_tx_types_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TransactionState) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TransactionState) ProtoMessage() {}

func (x *TransactionState) ProtoReflect() protoreflect.Message {
	mi := &file_spacemesh_v1_tx_types_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TransactionState.ProtoReflect.Descriptor instead.
func (*TransactionState) Descriptor() ([]byte, []int) {
	return file_spacemesh_v1_tx_types_proto_rawDescGZIP(), []int{7}
}

func (x *TransactionState) GetId() *TransactionId {
	if x != nil {
		return x.Id
	}
	return nil
}

func (x *TransactionState) GetState() TransactionState_TransactionState {
	if x != nil {
		return x.State
	}
	return TransactionState_TRANSACTION_STATE_UNSPECIFIED
}

var File_spacemesh_v1_tx_types_proto protoreflect.FileDescriptor

var file_spacemesh_v1_tx_types_proto_rawDesc = []byte{
	0x0a, 0x1b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x65, 0x73, 0x68, 0x2f, 0x76, 0x31, 0x2f, 0x74,
	0x78, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0c, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x6d, 0x65, 0x73, 0x68, 0x2e, 0x76, 0x31, 0x1a, 0x17, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2f, 0x72, 0x70, 0x63, 0x2f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x18, 0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x65, 0x73, 0x68, 0x2f,
	0x76, 0x31, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x55,
	0x0a, 0x0f, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x49, 0x64,
	0x73, 0x12, 0x42, 0x0a, 0x0e, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x6d, 0x65, 0x73, 0x68, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63,
	0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x52, 0x0d, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x49, 0x64, 0x22, 0x3c, 0x0a, 0x18, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x54,
	0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x12, 0x20, 0x0a, 0x0b, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x0b, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x22, 0x81, 0x01, 0x0a, 0x19, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x54, 0x72,
	0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x12, 0x2a, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x12, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x72, 0x70, 0x63, 0x2e, 0x53,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x38, 0x0a,
	0x07, 0x74, 0x78, 0x73, 0x74, 0x61, 0x74, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1e,
	0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x65, 0x73, 0x68, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x72,
	0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x65, 0x52, 0x07,
	0x74, 0x78, 0x73, 0x74, 0x61, 0x74, 0x65, 0x22, 0x5e, 0x0a, 0x18, 0x54, 0x72, 0x61, 0x6e, 0x73,
	0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x53, 0x74, 0x61, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x12, 0x42, 0x0a, 0x0e, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x6d, 0x65, 0x73, 0x68, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x72, 0x61, 0x6e, 0x73,
	0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x52, 0x0d, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61,
	0x63, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x22, 0x6a, 0x0a, 0x19, 0x54, 0x72, 0x61, 0x6e, 0x73,
	0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x53, 0x74, 0x61, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x12, 0x4d, 0x0a, 0x12, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x73, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x65, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b,
	0x32, 0x1e, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x65, 0x73, 0x68, 0x2e, 0x76, 0x31, 0x2e,
	0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x65,
	0x52, 0x11, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x53, 0x74,
	0x61, 0x74, 0x65, 0x22, 0x64, 0x0a, 0x1e, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x53, 0x74, 0x61, 0x74, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x42, 0x0a, 0x0e, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63,
	0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1b, 0x2e,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x65, 0x73, 0x68, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x72, 0x61,
	0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x52, 0x0d, 0x74, 0x72, 0x61, 0x6e,
	0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x22, 0x70, 0x0a, 0x1f, 0x54, 0x72, 0x61,
	0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x53, 0x74, 0x61, 0x74, 0x65, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x4d, 0x0a, 0x12,
	0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x5f, 0x73, 0x74, 0x61,
	0x74, 0x65, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1e, 0x2e, 0x73, 0x70, 0x61, 0x63, 0x65,
	0x6d, 0x65, 0x73, 0x68, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x65, 0x52, 0x11, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61,
	0x63, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x53, 0x74, 0x61, 0x74, 0x65, 0x22, 0x87, 0x03, 0x0a, 0x10,
	0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x65,
	0x12, 0x2b, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x6d, 0x65, 0x73, 0x68, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x72, 0x61, 0x6e,
	0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x52, 0x02, 0x69, 0x64, 0x12, 0x45, 0x0a,
	0x05, 0x73, 0x74, 0x61, 0x74, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x2f, 0x2e, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x6d, 0x65, 0x73, 0x68, 0x2e, 0x76, 0x31, 0x2e, 0x54, 0x72, 0x61, 0x6e,
	0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x65, 0x2e, 0x54, 0x72, 0x61,
	0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x65, 0x52, 0x05, 0x73,
	0x74, 0x61, 0x74, 0x65, 0x22, 0xfe, 0x01, 0x0a, 0x10, 0x54, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63,
	0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x65, 0x12, 0x21, 0x0a, 0x1d, 0x54, 0x52, 0x41,
	0x4e, 0x53, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x53, 0x54, 0x41, 0x54, 0x45, 0x5f, 0x55,
	0x4e, 0x53, 0x50, 0x45, 0x43, 0x49, 0x46, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x1e, 0x0a, 0x1a,
	0x54, 0x52, 0x41, 0x4e, 0x53, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x53, 0x54, 0x41, 0x54,
	0x45, 0x5f, 0x52, 0x45, 0x4a, 0x45, 0x43, 0x54, 0x45, 0x44, 0x10, 0x01, 0x12, 0x28, 0x0a, 0x24,
	0x54, 0x52, 0x41, 0x4e, 0x53, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x53, 0x54, 0x41, 0x54,
	0x45, 0x5f, 0x49, 0x4e, 0x53, 0x55, 0x46, 0x46, 0x49, 0x43, 0x49, 0x45, 0x4e, 0x54, 0x5f, 0x46,
	0x55, 0x4e, 0x44, 0x53, 0x10, 0x02, 0x12, 0x21, 0x0a, 0x1d, 0x54, 0x52, 0x41, 0x4e, 0x53, 0x41,
	0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x53, 0x54, 0x41, 0x54, 0x45, 0x5f, 0x43, 0x4f, 0x4e, 0x46,
	0x4c, 0x49, 0x43, 0x54, 0x49, 0x4e, 0x47, 0x10, 0x03, 0x12, 0x1d, 0x0a, 0x19, 0x54, 0x52, 0x41,
	0x4e, 0x53, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x53, 0x54, 0x41, 0x54, 0x45, 0x5f, 0x4d,
	0x45, 0x4d, 0x50, 0x4f, 0x4f, 0x4c, 0x10, 0x04, 0x12, 0x1a, 0x0a, 0x16, 0x54, 0x52, 0x41, 0x4e,
	0x53, 0x41, 0x43, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x53, 0x54, 0x41, 0x54, 0x45, 0x5f, 0x4d, 0x45,
	0x53, 0x48, 0x10, 0x05, 0x12, 0x1f, 0x0a, 0x1b, 0x54, 0x52, 0x41, 0x4e, 0x53, 0x41, 0x43, 0x54,
	0x49, 0x4f, 0x4e, 0x5f, 0x53, 0x54, 0x41, 0x54, 0x45, 0x5f, 0x50, 0x52, 0x4f, 0x43, 0x45, 0x53,
	0x53, 0x45, 0x44, 0x10, 0x06, 0x42, 0x34, 0x5a, 0x32, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e,
	0x63, 0x6f, 0x6d, 0x2f, 0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x65, 0x73, 0x68, 0x6f, 0x73, 0x2f,
	0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x2f, 0x67, 0x6f, 0x2f, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x6d, 0x65, 0x73, 0x68, 0x2f, 0x76, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_spacemesh_v1_tx_types_proto_rawDescOnce sync.Once
	file_spacemesh_v1_tx_types_proto_rawDescData = file_spacemesh_v1_tx_types_proto_rawDesc
)

func file_spacemesh_v1_tx_types_proto_rawDescGZIP() []byte {
	file_spacemesh_v1_tx_types_proto_rawDescOnce.Do(func() {
		file_spacemesh_v1_tx_types_proto_rawDescData = protoimpl.X.CompressGZIP(file_spacemesh_v1_tx_types_proto_rawDescData)
	})
	return file_spacemesh_v1_tx_types_proto_rawDescData
}

var file_spacemesh_v1_tx_types_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_spacemesh_v1_tx_types_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_spacemesh_v1_tx_types_proto_goTypes = []interface{}{
	(TransactionState_TransactionState)(0),  // 0: spacemesh.v1.TransactionState.TransactionState
	(*TransactionsIds)(nil),                 // 1: spacemesh.v1.TransactionsIds
	(*SubmitTransactionRequest)(nil),        // 2: spacemesh.v1.SubmitTransactionRequest
	(*SubmitTransactionResponse)(nil),       // 3: spacemesh.v1.SubmitTransactionResponse
	(*TransactionsStateRequest)(nil),        // 4: spacemesh.v1.TransactionsStateRequest
	(*TransactionsStateResponse)(nil),       // 5: spacemesh.v1.TransactionsStateResponse
	(*TransactionsStateStreamRequest)(nil),  // 6: spacemesh.v1.TransactionsStateStreamRequest
	(*TransactionsStateStreamResponse)(nil), // 7: spacemesh.v1.TransactionsStateStreamResponse
	(*TransactionState)(nil),                // 8: spacemesh.v1.TransactionState
	(*TransactionId)(nil),                   // 9: spacemesh.v1.TransactionId
	(*status.Status)(nil),                   // 10: google.rpc.Status
}
var file_spacemesh_v1_tx_types_proto_depIdxs = []int32{
	9,  // 0: spacemesh.v1.TransactionsIds.transaction_id:type_name -> spacemesh.v1.TransactionId
	10, // 1: spacemesh.v1.SubmitTransactionResponse.status:type_name -> google.rpc.Status
	8,  // 2: spacemesh.v1.SubmitTransactionResponse.txstate:type_name -> spacemesh.v1.TransactionState
	9,  // 3: spacemesh.v1.TransactionsStateRequest.transaction_id:type_name -> spacemesh.v1.TransactionId
	8,  // 4: spacemesh.v1.TransactionsStateResponse.transactions_state:type_name -> spacemesh.v1.TransactionState
	9,  // 5: spacemesh.v1.TransactionsStateStreamRequest.transaction_id:type_name -> spacemesh.v1.TransactionId
	8,  // 6: spacemesh.v1.TransactionsStateStreamResponse.transactions_state:type_name -> spacemesh.v1.TransactionState
	9,  // 7: spacemesh.v1.TransactionState.id:type_name -> spacemesh.v1.TransactionId
	0,  // 8: spacemesh.v1.TransactionState.state:type_name -> spacemesh.v1.TransactionState.TransactionState
	9,  // [9:9] is the sub-list for method output_type
	9,  // [9:9] is the sub-list for method input_type
	9,  // [9:9] is the sub-list for extension type_name
	9,  // [9:9] is the sub-list for extension extendee
	0,  // [0:9] is the sub-list for field type_name
}

func init() { file_spacemesh_v1_tx_types_proto_init() }
func file_spacemesh_v1_tx_types_proto_init() {
	if File_spacemesh_v1_tx_types_proto != nil {
		return
	}
	file_spacemesh_v1_types_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_spacemesh_v1_tx_types_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TransactionsIds); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_spacemesh_v1_tx_types_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SubmitTransactionRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_spacemesh_v1_tx_types_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SubmitTransactionResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_spacemesh_v1_tx_types_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TransactionsStateRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_spacemesh_v1_tx_types_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TransactionsStateResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_spacemesh_v1_tx_types_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TransactionsStateStreamRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_spacemesh_v1_tx_types_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TransactionsStateStreamResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_spacemesh_v1_tx_types_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TransactionState); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_spacemesh_v1_tx_types_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_spacemesh_v1_tx_types_proto_goTypes,
		DependencyIndexes: file_spacemesh_v1_tx_types_proto_depIdxs,
		EnumInfos:         file_spacemesh_v1_tx_types_proto_enumTypes,
		MessageInfos:      file_spacemesh_v1_tx_types_proto_msgTypes,
	}.Build()
	File_spacemesh_v1_tx_types_proto = out.File
	file_spacemesh_v1_tx_types_proto_rawDesc = nil
	file_spacemesh_v1_tx_types_proto_goTypes = nil
	file_spacemesh_v1_tx_types_proto_depIdxs = nil
}
