alter table FIAS_ADDRESS_HOUSE_LINK add constraint FK_ADDHOU_HOUSE foreign key (HOUSE_ID) references FIAS_HOUSE(ID);
alter table FIAS_ADDRESS_HOUSE_LINK add constraint FK_ADDHOU_ADDRESS foreign key (ADDRESS_ID) references FIAS_ADDRESS(ID);